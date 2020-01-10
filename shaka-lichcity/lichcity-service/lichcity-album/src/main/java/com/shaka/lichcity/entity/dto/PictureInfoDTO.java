package com.shaka.lichcity.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author 袁振
 * @date 2020/1/9 14:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PictureInfoDTO extends BaseDTO{

	/**链接地址**/
	private String url ;

	/**排序**/
	private Long sort ;
}
