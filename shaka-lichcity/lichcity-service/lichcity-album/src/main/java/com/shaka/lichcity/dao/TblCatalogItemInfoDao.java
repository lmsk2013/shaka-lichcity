package com.shaka.lichcity.dao;

import com.shaka.lichcity.entity.po.TblCatalogItemInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/10 20:00
 */
public interface TblCatalogItemInfoDao extends
		JpaRepository<TblCatalogItemInfoDO,Long> {

	List<TblCatalogItemInfoDO> findAllByCatalogPageId(Long id);
}
