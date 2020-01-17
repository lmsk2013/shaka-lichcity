package com.shaka.lichcity.pojo.vo.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 单ID请求参数
 * @author 袁振
 * @date 2020/1/14 20:20
 */
@Data
public class IdParameter {

	/**id**/
	@NotNull
	private Long id ;
}
