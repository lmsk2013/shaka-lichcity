package com.shaka.lichcity.service;

import com.shaka.lichcity.pojo.dto.PagingDTO;
import com.shaka.lichcity.pojo.dto.PictureInfoDTO;

/**
 * @author 袁振
 * @date 2020/1/16 20:47
 */
public interface PictureService {

	/***
	 * description:根据分页信息和图片组Id查询图片信息
	 * @author yuanzhen
	 * @date 2020/1/16
	 * @param groupId 图片组Id
	 * @param start 开始页码
	 * @param end 结束页码
	 * @return java.util.List<com.shaka.lichcity.pojo.dto.PictureInfoDTO>
	 */
	PagingDTO<PictureInfoDTO> getPagingGroupPictureInfoByPagingParamAndGroupId(Long groupId , Integer start , Integer end);
}
