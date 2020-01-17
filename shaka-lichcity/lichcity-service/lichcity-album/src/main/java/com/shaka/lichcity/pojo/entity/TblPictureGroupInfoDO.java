package com.shaka.lichcity.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author 袁振
 * @date 2020/1/8 21:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_picture_group_info")
@Proxy(lazy = false)
public class TblPictureGroupInfoDO extends ManagementItemBaseDO{

	/**所属相册ID**/
	@Basic
	@Column(name = "album_id")
	private Long albumId ;

	/**排序**/
	@Basic
	@Column(name = "sort")
	private Long sort ;

}
