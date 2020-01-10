package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * 目录DO
 * @author 袁振
 * @date 2020/1/8 19:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_catalog_info")
public class TblPageInfoDO extends ManagementItemBaseDO{

	/**目录样式编号**/
	@Basic
	@Column(name = "style")
	private String style ;

	/**字体名称**/
	@Basic
	@Column(name = "typeface_name")
	private String typefaceName;

	/**字号**/
	@Basic
	@Column(name = "font_size")
	private Integer fontSize ;

	/**字体颜色**/
	@Basic
	@Column(name = "font_color")
	private String fontColor ;

	/**背景图链接**/
	@Basic
	@Column(name = "background_url")
	private String backgroundUrl ;

	/**页面类型
	 * 001 公司简介
	 * 002 目录
	 * **/
	@Basic
	@Column(name = "page_type")
	private String pageType;

	/**文字内容**/
	@Basic
	@Column(name = "content_text")
	private String contentText;
}
