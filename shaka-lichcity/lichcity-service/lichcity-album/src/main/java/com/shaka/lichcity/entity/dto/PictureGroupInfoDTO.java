package com.shaka.lichcity.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/9 14:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PictureGroupInfoDTO extends BaseDTO{

	/**图片列表**/
	private List<PictureInfoDTO> pictures ;

	/**排序**/
	private Long sort ;
}
