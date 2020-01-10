package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author 袁振
 * @date 2020/1/8 21:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_picture_group_info")
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
