package com.shaka.lichcity.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 袁振
 * @date 2020/1/10 19:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogPageDTO extends PageInfoDTO {

	/**目录项集合**/
	private List<CatalogItemDTO> catalogItems ;

}
