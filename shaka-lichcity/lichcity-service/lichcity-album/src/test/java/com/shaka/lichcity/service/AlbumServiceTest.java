package com.shaka.lichcity.service;

import com.shaka.lichcity.TestAlbumApplication;
import com.shaka.lichcity.pojo.dto.AlbumInfoDTO;
import com.shaka.lichcity.pojo.dto.PagingDTO;
import com.shaka.lichcity.pojo.dto.PictureInfoDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 袁振
 * @date 2020/1/16 10:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestAlbumApplication.class},
webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AlbumServiceTest {

	@Autowired
	private AlbumService albumService ;

	@Autowired
	private PictureService pictureService;

	/***
	 * description:测试获取相册信息
	 * @author yuanzhen
	 * @date 2020/1/17
	 * @param
	 * @return void
	 */
	@Test
	public void testGetAlbumInfo(){
		AlbumInfoDTO rst = albumService.getAlbumInfoById(1L);
		System.out.println(rst.getAnimationType());
	}

	@Test
	public void testGetGroupPagePictures(){
		PagingDTO<PictureInfoDTO> pictureInfos = pictureService.getPagingGroupPictureInfoByPagingParamAndGroupId(1L,0,10);
		System.out.println(pictureInfos.getTotalCount());
	}
}
