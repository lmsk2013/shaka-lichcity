package com.shaka.lichcity.pojo.vo.result.data;

import com.shaka.lichcity.pojo.dto.PagingDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页返回data
 * @author 袁振
 * @date 2020/1/14 16:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageListResult<T> extends BaseResultData {

	/**记录数**/
	private Integer recordCount ;

	/**总条数**/
	private Long totalCount ;

	/**页码**/
	private Integer pageNo ;

	/**页长**/
	private Integer pageSize ;

	/**数据内容**/
	private List<T> list ;

	/***
	 * description:根据分页信息构建返回结果
	 * @author yuanzhen
	 * @date 2020/1/17
	 * @param pagingDTO 分页信息
	 * @param pageNo  页码
	 * @param pageSize  页长
	 * @return
	 */
	public PageListResult(PagingDTO pagingDTO ,
						  Integer pageNo,Integer pageSize,String msg){
		super(msg);
		this.recordCount = pagingDTO.getRecordCount();
		this.totalCount = pagingDTO.getTotalCount();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.list = pagingDTO.getList();
	}
}
