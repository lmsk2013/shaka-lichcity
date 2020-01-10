package com.shaka.lichcity.entity.dto;

import com.shaka.lichcity.entity.po.TblAlbumInfoDO;
import com.shaka.lichcity.entity.po.TblCatalogItemInfoDO;
import com.shaka.lichcity.entity.po.TblPageInfoDO;
import lombok.*;

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
		this.name = albumInfoDO.getName();
		this.animationType = albumInfoDO.getAnimationType();
		this.style = albumInfoDO.getStyle();
		this.coverUrl = albumInfoDO.getCoverUrl();
		this.titlePageUrl = albumInfoDO.getTitlePageUrl();
		this.catalogInfo = this.assembleCatalogInfo(catalogDO,catalogItems);
		this.companyProfilePageInfo = this.assembleCompanyProfilePageInfo(profilePage);
		this.pictureGroupIds = catalogItems.stream().map(c -> c.getPictureGroupId()).collect(Collectors.toList());

	}
}
