package com.shaka.lichcity.pojo.vo.reqeust;

import com.shaka.lichcity.pojo.vo.request.PagingRequestParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 分组、分页图片请求参数
 * @author 袁振
 * @date 2020/1/14 20:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagingGroupPicturesParameter extends PagingRequestParameter {

	/**图片组编码**/
	@NotNull
	private Long pictureGroupId ;

}
