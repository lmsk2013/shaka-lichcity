package com.shaka.lichcity.dao;

import com.shaka.lichcity.pojo.entity.TblAlbumInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 袁振
 * @date 2020/1/8 18:52
 */
public interface TblAlbumInfoDao extends
		JpaRepository<TblAlbumInfoDO,Long> {

}
