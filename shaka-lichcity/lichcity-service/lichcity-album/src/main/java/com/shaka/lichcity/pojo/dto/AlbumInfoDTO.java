package com.shaka.lichcity.pojo.dto;

import com.shaka.lichcity.pojo.entity.TblAlbumInfoDO;
import com.shaka.lichcity.pojo.entity.TblCatalogItemInfoDO;
import com.shaka.lichcity.pojo.entity.TblPageInfoDO;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 袁振
 * @date 2020/1/8 19:12
 */
@Builder
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbumInfoDTO extends BaseDTO{

	/**名称**/
	private String name ;

	/**动效类型**/
	private String animationType ;

	/**相册样式类型编码**/
	private String style ;

	/**封面链接**/
	private String coverUrl ;

	/**扉页连接**/
	private String titlePageUrl ;

	/**目录信息**/
	private CatalogPageDTO catalogInfo ;

	/**公司简介页面信息**/
	private PageInfoDTO companyProfilePageInfo ;

	/**图片组信息**/
	private List<Long> pictureGroupIds;

	/***
	 * description:根据信息组合数据
	 * @author yuanzhen
	 * @date 2020/1/10
	 * @param albumInfoDO
	 * @param catalogDO
	 * @param catalogItems
	 * @param profilePage
	 * @return
	 */
	public AlbumInfoDTO(TblAlbumInfoDO albumInfoDO, TblPageInfoDO catalogDO,
						List<TblCatalogItemInfoDO> catalogItems,
						TblPageInfoDO profilePage){
		super(albumInfoDO.getId());
		this.name = albumInfoDO.getName();
		this.animationType = albumInfoDO.getAnimationType();
		this.style = albumInfoDO.getStyle();
		this.coverUrl = albumInfoDO.getCoverUrl();
		this.titlePageUrl = albumInfoDO.getTitlePageUrl();
		this.catalogInfo = this.assembleCatalogInfo(catalogDO,catalogItems);
		this.companyProfilePageInfo = this.assembleCompanyProfilePageInfo(profilePage);
		this.pictureGroupIds = catalogItems.stream().map(TblCatalogItemInfoDO::getPictureGroupId).collect(Collectors.toList());

	}

	/***
	 * description:组装公司介绍页
	 * @author yuanzhen
	 * @date 2020/1/13
	 * @param profilePage
	 * @return com.shaka.lichcity.entity.dto.PageInfoDTO
	 */
	private PageInfoDTO assembleCompanyProfilePageInfo(TblPageInfoDO profilePage) {
		//1.若无公司简介页则返回空
		if (null == profilePage){
			return null ;
		}
		//2.否则则组装公司简介页
		PageInfoDTO rst = this.assemblePageInfo(profilePage);
		rst.setBackgroundUrl(profilePage.getBackgroundUrl());
		rst.setFontColor(profilePage.getFontColor());
		rst.setFontSize(profilePage.getFontSize());
		rst.setStyle(profilePage.getStyle());
		rst.setTypefaceName(profilePage.getTypefaceName());
		rst.setId(profilePage.getId());
		return rst ;
	}

	/***
	 * description:组装菜单页
	 * @author yuanzhen
	 * @date 2020/1/13
	 * @param catalogDO
	 * @param catalogItems
	 * @return com.shaka.lichcity.entity.dto.CatalogPageDTO
	 */
	private CatalogPageDTO assembleCatalogInfo(TblPageInfoDO catalogDO, List<TblCatalogItemInfoDO> catalogItems) {
		//1.没有菜单信息 直接返回空
		if (null == catalogDO){
			return null ;
		}
		//2.否则则组装菜单信息
		CatalogPageDTO rst = (CatalogPageDTO) this.assemblePageInfo(catalogDO);
		List<CatalogItemDTO> items = new ArrayList<>(catalogItems.size());
		for (TblCatalogItemInfoDO item : catalogItems ){
			CatalogItemDTO itemDTO = new CatalogItemDTO();
			itemDTO.setCatalogPageId(item.getCatalogPageId());
			itemDTO.setPictureGroupId(item.getPictureGroupId());
			itemDTO.setTitle(item.getTitle());
			itemDTO.setId(item.getId());
			items.add(itemDTO);
		}
		rst.setCatalogItems(items);
		return rst ;
	}

	/***
	 * description:构造页面对象
	 * @author yuanzhen
	 * @date 2020/1/13
	 * @param pageDO
	 * @return com.shaka.lichcity.entity.dto.PageInfoDTO
	 */
	private PageInfoDTO assemblePageInfo(TblPageInfoDO pageDO){
		PageInfoDTO rst = new PageInfoDTO();
		rst.setBackgroundUrl(pageDO.getBackgroundUrl());
		rst.setFontColor(pageDO.getFontColor());
		rst.setFontSize(pageDO.getFontSize());
		rst.setStyle(pageDO.getStyle());
		rst.setTypefaceName(pageDO.getTypefaceName());
		rst.setId(pageDO.getId());
		return rst;
	}

}
