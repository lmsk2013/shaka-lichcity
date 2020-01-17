package com.shaka.lichcity.pojo.vo.result.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 复选框、下拉框、单选框返回内容
 * @author 袁振
 * @date 2020/1/14 16:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseSelectionBoxVO {

	/**是否选择
	 * 1 True
	 * 0 False
	 * **/
	private Integer isSelect ;
}
