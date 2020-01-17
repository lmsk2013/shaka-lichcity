package com.shaka.lichcity.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * 目录项DO
 * @author 袁振
 * @date 2020/1/10 19:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_catalog_item_info")
@Proxy(lazy = false)
public class TblCatalogItemInfoDO extends ManagementItemBaseDO{

	/**标题**/
	@Basic
	@Column(name = "title")
	private String title ;

	/**对应图片组**/
	@Basic
	@Column(name = "picture_group_id")
	private Long pictureGroupId ;

	/**所属目录页id**/
	@Basic
	@Column(name = "catalog_page_id")
	private Long catalogPageId ;

	/**排序**/
	@Basic
	@Column(name = "sort")
	private Integer sort ;
}
