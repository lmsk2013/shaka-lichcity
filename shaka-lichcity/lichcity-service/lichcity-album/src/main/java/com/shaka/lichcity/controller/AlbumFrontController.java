package com.shaka.lichcity.controller;

import com.shaka.lichcity.pojo.dto.AlbumInfoDTO;
import com.shaka.lichcity.pojo.dto.PagingDTO;
import com.shaka.lichcity.pojo.dto.PictureInfoDTO;
import com.shaka.lichcity.pojo.vo.reqeust.PagingGroupPicturesParameter;
import com.shaka.lichcity.pojo.vo.request.IdParameter;
import com.shaka.lichcity.pojo.vo.result.Result;
import com.shaka.lichcity.pojo.vo.result.data.EntityResult;
import com.shaka.lichcity.pojo.vo.result.data.PageListResult;
import com.shaka.lichcity.service.AlbumService;
import com.shaka.lichcity.service.PictureService;
import com.shaka.lichcity.service.ResultService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 样册前段空气器
 * @author 袁振
 * @date 2020/1/14 15:51
 */
@Slf4j
@RestController
@RequestMapping("/front")
public class AlbumFrontController {

	/**相册接口**/
	private final AlbumService albumService;

	/**返回值接口**/
	private final ResultService resultService ;

	/**图片接口**/
	private final PictureService pictureService ;

	@Autowired
	public AlbumFrontController(AlbumService albumService, ResultService resultService, PictureService pictureService) {
		this.albumService = albumService;
		this.resultService = resultService;
		this.pictureService = pictureService;
	}


	/***
	 * description:根据id获取相册信息
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param body id
	 * @return com.shaka.lichcity.entity.vo.result.Result
	 */
	@GetMapping("/albumInfo")
	public Result getAlbumInfoById(@RequestParam("body") IdParameter body){
		//1.获取请求参数
		Long id = body.getId();
		log.info("用户访问id为：{}的画册",id);
		//2.查询表数据
		AlbumInfoDTO albumInfo = albumService.getAlbumInfoById(id);
		//3.判断结果是否为空
		if(null == albumInfo) {
			log.error("查询失败，未找到指定的相册");
			return resultService.createFailReuslt("未找到指定的相册");
		}
		//4.返回查询结果
		EntityResult<AlbumInfoDTO> data = new EntityResult<>();
		data.setEntity(albumInfo);
		data.setMsg("查询成功");
		return resultService.createSuccessResult(data);
	}

	/***
	 * description:根据分组号与分页信息查询图片
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param body 请求体
	 * @return com.shaka.lichcity.entity.vo.result.Result
	 */
	@GetMapping("/group/pictures")
	public Result getPicturesByGroupIdAndPageInfo(
			@RequestBody PagingGroupPicturesParameter body){
		//1.获取请求参数
		Long groupId = body.getPictureGroupId();
		Integer start = body.getStartIndex();
		Integer end = body.getEndIndex();
		//2.查询表数据
		PagingDTO<PictureInfoDTO> pictureInfo = pictureService.getPagingGroupPictureInfoByPagingParamAndGroupId(groupId,start,end);
		PageListResult<PictureInfoDTO> rst = new PageListResult<>(pictureInfo,
				body.getPageNo(),body.getPageSize(),"查询成功");
		//3.返回结果
		return resultService.createSuccessResult(rst);
	}
}
