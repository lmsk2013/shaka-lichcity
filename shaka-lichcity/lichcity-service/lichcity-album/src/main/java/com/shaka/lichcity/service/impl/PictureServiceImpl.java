package com.shaka.lichcity.service.impl;

import com.shaka.lichcity.dao.TblPictureInfoDao;
import com.shaka.lichcity.pojo.dto.PagingDTO;
import com.shaka.lichcity.pojo.dto.PictureInfoDTO;
import com.shaka.lichcity.pojo.entity.TblPictureInfoDO;
import com.shaka.lichcity.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author 袁振
 * @date 2020/1/16 20:55
 */
@Service
public class PictureServiceImpl implements PictureService {

	/**图片查询Dao**/
	private final TblPictureInfoDao pictureInfoDao;

	@Autowired
	public PictureServiceImpl(TblPictureInfoDao pictureInfoDao) {
		this.pictureInfoDao = pictureInfoDao;
	}

	@Override
	public PagingDTO<PictureInfoDTO> getPagingGroupPictureInfoByPagingParamAndGroupId(Long groupId, Integer start, Integer end) {
		//1.设置排序条件
		Sort sort = new Sort(Sort.Direction.ASC,"sort");
		//2.设置分页
		Pageable pageable = PageRequest.of(start,end,sort);
		Page<TblPictureInfoDO> pictureInfoPageDO = pictureInfoDao.findAllByPictureGroupId(groupId,pageable);
		//3.组装返回值
		return new PagingDTO<>(pictureInfoPageDO);
	}
}
