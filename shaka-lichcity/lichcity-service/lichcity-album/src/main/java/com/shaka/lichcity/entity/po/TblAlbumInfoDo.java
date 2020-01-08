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
public class TblAlbumInfoDo extends ManagementItemBaseDo{

	/**动效类型**/
	@Basic
	@Column(name = "animation_type")
	private int animationType ;

	/**目录id**/
	@Basic
	@Column(name = "catalog_id")
	private Long catalogId ;

	/**扉页id**/
	@Basic
	@Column(name = "title_page_id")
	private Long titlePageId ;

	/**封面id**/
	@Basic
	@Column(name = "cover_id")
	private Long coverId ;

	/**公司简介页面id**/
	@Basic
	@Column(name = "company_profile_page_id")
	private String companyProfilePageId ;
}
