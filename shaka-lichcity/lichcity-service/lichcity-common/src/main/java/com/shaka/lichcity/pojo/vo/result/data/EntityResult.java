package com.shaka.lichcity.pojo.vo.result.data;

import lombok.*;

/**
 * 实体返回data
 * @author 袁振
 * @date 2020/1/14 16:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntityResult<T> extends BaseResultData{

	/**数据内容**/
	private T entity ;
}
