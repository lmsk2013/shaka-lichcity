package com.shaka.lichcity.dao;

import com.shaka.lichcity.entity.po.TblPageInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 袁振
 * @date 2020/1/9 15:03
 */
public interface TblPageInfoDao extends
		JpaRepository<TblPageInfoDO,Long> {
}
