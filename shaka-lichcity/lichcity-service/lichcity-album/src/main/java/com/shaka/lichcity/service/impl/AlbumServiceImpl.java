package com.shaka.lichcity.service.impl;

import com.shaka.lichcity.dao.TblAlbumInfoDao;
import com.shaka.lichcity.dao.TblCatalogItemInfoDao;
import com.shaka.lichcity.dao.TblPageInfoDao;
import com.shaka.lichcity.dao.TblPictureGroupInfoDao;
import com.shaka.lichcity.pojo.dto.AlbumInfoDTO;
import com.shaka.lichcity.pojo.entity.TblAlbumInfoDO;
import com.shaka.lichcity.pojo.entity.TblCatalogItemInfoDO;
import com.shaka.lichcity.pojo.entity.TblPageInfoDO;
import com.shaka.lichcity.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/8 19:31
 */
@Service
public class AlbumServiceImpl implements AlbumService {

	/**相册Dao**/
	private final TblAlbumInfoDao albumDao;

	/**页面Dao**/
	private final TblPageInfoDao pageDao ;

	/**图片组Dao**/
	private final TblPictureGroupInfoDao pictureGroupDao ;

	/**目录项Dao**/
	private final TblCatalogItemInfoDao catalogItemDao ;

	/***
	 * description:构造方法
	 * @author yuanzhen
	 * @date 2020/1/9
	 * @param albumDao 相册Dao
	 * @param pageDao  页面Dao
	 * @param pictureGroupDao  图片组Dao
	 * @param catalogItemDao 目录项Dao
	 * @return
	 */
	@Autowired
	public AlbumServiceImpl(TblAlbumInfoDao albumDao, TblPageInfoDao pageDao, TblPictureGroupInfoDao pictureGroupDao, TblCatalogItemInfoDao catalogItemDao) {
		this.albumDao = albumDao;
		this.pageDao = pageDao;
		this.pictureGroupDao = pictureGroupDao;
		this.catalogItemDao = catalogItemDao;
	}

	/***
	 * description:根据Id获取相册信息
	 * @author yuanzhen
	 * @date 2020/1/8
	 * @param id
	 * @return com.shaka.lichcity.entity.dto.AlbumInfoDTO
	 */
	@Override
	@Cacheable(cacheNames = {"album","album"} , key = "#id")
	public AlbumInfoDTO getAlbumInfoById(Long id) {
		//1.获取相册基本信息
		TblAlbumInfoDO albumInfoDO = albumDao.findById(id).orElse(null);
		if (null == albumInfoDO){
			return null ;
		}
		//2.获取目录信息
		TblPageInfoDO catalogDO = pageDao.findById(albumInfoDO.getCatalogId()).orElse(null);
		//3.获取目录项信息
		List<TblCatalogItemInfoDO> catalogItems = new ArrayList<>();
		if (null != catalogDO){
			catalogItems = catalogItemDao.findAllByCatalogPageId(catalogDO.getId());
		}
		//4.获取公司简介页信息
		TblPageInfoDO profilePage = pageDao.findById(albumInfoDO.getCompanyProfilePageId()).orElse(null);
		return new AlbumInfoDTO(albumInfoDO,catalogDO,catalogItems,profilePage);
	}
}
