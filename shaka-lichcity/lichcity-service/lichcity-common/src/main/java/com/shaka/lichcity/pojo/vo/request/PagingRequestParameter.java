package com.shaka.lichcity.pojo.vo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author 袁振
 * @date 2020/1/16 20:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagingRequestParameter {

	/**页码**/
	@NotNull
	private Integer pageNo ;

	/**页长**/
	@NotNull
	private Integer pageSize ;

	/***
	 * description:获取开始下标
	 * @author yuanzhen
	 * @date 2020/1/16
	 * @param
	 * @return java.lang.Integer
	 */
	public Integer getStartIndex(){
		return  (this.pageNo - 1) * this.pageSize ;
	}

	/***
	 * description:获取结束下标
	 * @author yuanzhen
	 * @date 2020/1/16
	 * @param
	 * @return java.lang.Integer
	 */
	public Integer getEndIndex(){
		return (this.pageNo * this.pageSize) - 1;
	}
}
