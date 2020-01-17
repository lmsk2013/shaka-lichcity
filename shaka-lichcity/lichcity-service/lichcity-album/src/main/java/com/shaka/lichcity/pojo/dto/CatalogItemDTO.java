package com.shaka.lichcity.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author 袁振
 * @date 2020/1/10 19:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogItemDTO extends BaseDTO{

	/**标题**/
	private String title ;

	/**对应图片组**/
	private Long pictureGroupId ;

	/**所属目录页id**/
	private Long catalogPageId ;
}
