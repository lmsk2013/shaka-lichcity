package com.shaka.lichcity.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 管理项拓展基础数据
 * 拓展创建人、修改人、是否逻辑删除和标注字段
 * @author 袁振
 * @date 2020/1/8 8:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class ManagementItemBaseDo extends BaseDo{

	/**创建人**/
	@Basic
	@Column(name = "creator")
	private String  creator ;

	/**修改人**/
	@Basic
	@Column(name = "modifier")
	private String  modifier ;

	/**是否逻辑删除**/
	@Basic
	@Column(name = "is_deleted",columnDefinition="int default 1",insertable = false,nullable = false)
	private int deleted ;

	/**标注**/
	@Basic
	@Column(name = "remark")
	private String  remark ;
}
