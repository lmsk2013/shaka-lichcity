package com.shaka.lichcity.contants;

/**
 * 返回码枚举
 * @author 袁振
 * @date 2020/1/14 19:01
 */
public enum ResultCodeEnum {

	/**请求处理成功**/
	SUCCESS(200,"请求处理成功"),

	/**请求处理失败**/
	FAIL(500,"请求处理失败"),

	/**请求未认证**/
	UNCERTIFIED(401,"请求未认证，跳转登录页"),

	/**请求未授权**/
	UNAUTHORIZED(406,"请求未授权，跳转未授权提示页");

	/**返回码**/
	private Integer code ;

	/**错误信息**/
	private String message ;

	ResultCodeEnum(Integer code ,String message){
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
