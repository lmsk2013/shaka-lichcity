package com.shaka.lichcity.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/8 20:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageInfoDTO extends BaseDTO{

	/**样式编号**/
	private String style ;

	/**字体名称**/
	private String typefaceName;

	/**字号**/
	private Integer fontSize ;

	/**字体颜色**/
	private String fontColor ;

	/**背景图链接**/
	private String backgroundUrl ;

}
