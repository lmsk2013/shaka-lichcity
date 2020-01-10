package com.shaka.lichcity.dao;

import com.shaka.lichcity.entity.po.TblPictureInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 袁振
 * @date 2020/1/9 15:05
 */
public interface TblPictureInfoDao extends
		JpaRepository<TblPictureInfoDO,Long> {
}
