package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * tbl_album_info表实体映射
 * @author 袁振
 * @date 2020/1/7 19:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_album_info")
public class TblAlbumInfoDO extends ManagementItemBaseDO{

	/**相册页面样式类型Id**/
	@Basic
	@Column(name = "style")
	private String style;

	/**动效类型**/
	@Basic
	@Column(name = "animation_type")
	private String animationType ;

	/**封面链接**/
	@Basic
	@Column(name = "cover_url")
	private String coverUrl ;

	/**扉页链接**/
	@Basic
	@Column(name = "title_page_url")
	private String titlePageUrl ;

	/**公司简介页面id**/
	@Basic
	@Column(name = "company_profile_page_id")
	private Long companyProfilePageId ;

	/**目录id**/
	@Basic
	@Column(name = "catalog_id")
	private Long catalogId ;

}
