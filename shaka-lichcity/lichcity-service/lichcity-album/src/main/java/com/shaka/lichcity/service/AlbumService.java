package com.shaka.lichcity.service;

import com.shaka.lichcity.pojo.dto.AlbumInfoDTO;

/**
 * 相册相关服务接口定义
 * @author 袁振
 * @date 2020/1/8 18:56
 */
public interface AlbumService {

	/***
	 * description:根据Id获取相册信息
	 * @author yuanzhen
	 * @date 2020/1/8
	 * @param id
	 * @return com.shaka.lichcity.entity.dto.AlbumInfoDTO
	 */
	AlbumInfoDTO getAlbumInfoById(Long id);
}
