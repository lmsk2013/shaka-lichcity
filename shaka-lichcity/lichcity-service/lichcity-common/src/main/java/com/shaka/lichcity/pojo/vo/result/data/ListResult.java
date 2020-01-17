package com.shaka.lichcity.pojo.vo.result.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 列表返回data
 * @author 袁振
 * @date 2020/1/14 16:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListResult<T> extends BaseResultData{

	/**数据内容**/
	private List<T> list ;

}
