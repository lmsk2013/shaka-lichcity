package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * 图片表
 * @author 袁振
 * @date 2020/1/9 9:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_picture_info")
public class TblPictureInfoDO extends ManagementItemBaseDO {

	/**所属图片组id**/
	@Basic
	@Column(name = "picture_group_id")
	private Long pictureGroupId ;

	/**图片链接**/
	@Basic
	@Column(name = "url")
	private String url ;

	/**排序**/
	@Basic
	@Column(name = "sort")
	private Long sort ;
}
