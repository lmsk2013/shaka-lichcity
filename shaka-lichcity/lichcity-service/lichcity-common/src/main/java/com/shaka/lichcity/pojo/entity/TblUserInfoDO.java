package com.shaka.lichcity.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * @author 袁振
 * @date 2019/10/20 16:09
 * 用户信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_user_info")
public class TblUserInfoDO extends BaseDO{

	/**用户名**/
	@Basic
	@Column(name = "user_name",nullable = false)
	private String userName ;

	/**电子邮箱**/
	@Basic
	@Column(name = "email")
	private String email ;

	/**手机号**/
	@Basic
	@Column(name = "mobile",nullable = false)
	private String mobile ;

	/**登录名**/
	@Basic
	@Column(name = "login_name",nullable = false)
	private String loginName ;

	/**密码**/
	@Basic
	@Column(name = "password",nullable = false)
	private String password;

	/**
	 * 性别
	 * 0女
	 * 1男
	 * **/
	@Basic
	@Column(name = "sex")
	private Integer sex ;
}
