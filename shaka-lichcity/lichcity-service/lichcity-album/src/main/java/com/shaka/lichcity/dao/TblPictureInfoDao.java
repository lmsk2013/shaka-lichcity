package com.shaka.lichcity.dao;

import com.shaka.lichcity.pojo.entity.TblPictureInfoDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author 袁振
 * @date 2020/1/9 15:05
 */
public interface TblPictureInfoDao extends
		JpaRepository<TblPictureInfoDO,Long>{

	/***
	 * description:根据图片分组id分页查询
	 * @author yuanzhen
	 * @date 2020/1/17
	 * @param groupId 分组id
	 * @param pageable 分页信息
	 * @return org.springframework.data.domain.Page<com.shaka.lichcity.pojo.entity.TblPictureInfoDO>
	 */
	Page<TblPictureInfoDO> findAllByPictureGroupId(Long groupId,Pageable pageable);
}
