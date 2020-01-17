package com.shaka.lichcity.dao;

import com.shaka.lichcity.pojo.entity.TblCatalogItemInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/10 20:00
 */
public interface TblCatalogItemInfoDao extends
		JpaRepository<TblCatalogItemInfoDO,Long> {

	/***
	 * description:根据pageId查询所有菜单项
	 * @author yuanzhen
	 * @date 2020/1/16
	 * @param pageId
	 * @return java.util.List<com.shaka.lichcity.entity.po.TblCatalogItemInfoDO>
	 */
	List<TblCatalogItemInfoDO> findAllByCatalogPageId(Long pageId);
}
