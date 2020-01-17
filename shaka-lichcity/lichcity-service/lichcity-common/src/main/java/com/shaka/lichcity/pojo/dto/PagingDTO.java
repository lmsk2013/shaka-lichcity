package com.shaka.lichcity.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/17 9:16
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PagingDTO<T> {

	/**记录数**/
	private Integer recordCount ;

	/**总条数**/
	private Long totalCount ;

	/**数据内容**/
	private List<T> list ;

	/***
	 * description:根据分页信息获取DTO
	 * @author yuanzhen
	 * @date 2020/1/17
	 * @param page 分页信息
	 * @return
	 */
	public PagingDTO(Page page) {
		this.recordCount = page.getNumberOfElements();
		this.totalCount = page.getTotalElements();
		this.list = page.getContent();
	}
}
