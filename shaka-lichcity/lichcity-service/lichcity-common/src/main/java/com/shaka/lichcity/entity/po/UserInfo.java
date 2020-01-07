package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 袁振
 * @date 2019/10/20 16:09
 * 用户信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

	private Long id ;

	private String userName ;

	private String email ;

	public static UserInfo invalid(){
		return new UserInfo(-1L,"","");
	}
}
