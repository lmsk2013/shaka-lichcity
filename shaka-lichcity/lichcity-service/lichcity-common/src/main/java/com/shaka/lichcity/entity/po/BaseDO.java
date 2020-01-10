package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 表基本对象
 * 包含主键、创建时间、修改时间字段
 * @author 袁振
 * @date 2020/1/7 19:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseDO {

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

	/**更新时间**/
	@Basic
	@Column(name = "gmt_modified",nullable = false)
	@UpdateTimestamp
	private Date updateTime ;


}
