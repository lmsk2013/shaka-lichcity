package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 袁振
 * @date 2020/1/7 19:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseDo {

	/**主键**/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" ,nullable = false)
	private Long id ;

	/**创建时间**/
	@Basic
	@Column(name = "gmt_create",nullable = false)
	@CreationTimestamp
	private Date createTime ;

	/**注释**/
	@Basic
	@Column(name = "creator")
	private String  creator ;

	/**更新时间**/
	@Basic
	@Column(name = "gmt_modified",nullable = false)
	@UpdateTimestamp
	private Date updateTime ;

	/**注释**/
	@Basic
	@Column(name = "modifier")
	private String  modifier ;

	/**是否逻辑删除**/
	@Basic
	@Column(name = "is_deleted",columnDefinition="int default 1",insertable = false,nullable = false)
	private int deleted ;

	/**注释**/
	@Basic
	@Column(name = "remark")
	private String  remark ;
}
