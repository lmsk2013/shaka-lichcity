package com.shaka.lichcity.pojo.vo.result;

import com.shaka.lichcity.pojo.vo.result.data.BaseResultData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用rest返回值
 * @author 袁振
 * @date 2020/1/14 16:12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Result{

	/**返回码**/
	private Integer code ;

	/**数据**/
	private BaseResultData data ;

}
