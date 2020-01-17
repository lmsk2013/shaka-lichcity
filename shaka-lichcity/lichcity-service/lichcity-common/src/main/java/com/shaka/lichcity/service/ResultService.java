package com.shaka.lichcity.service;

import com.shaka.lichcity.pojo.vo.result.Result;
import com.shaka.lichcity.pojo.vo.result.data.BaseResultData;

/**
 * 返回值管理类
 * @author 袁振
 * @date 2020/1/14 19:18
 */
public interface ResultService {

	/***
	 * description:生成失败信息
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param errorMsg 错误信息
	 * @return com.shaka.lichcity.entity.vo.result.Result
	 */
	Result createFailReuslt(String errorMsg);

	/****
	 * description:生成实体返回信息
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param data  数据信息
	 * @return com.shaka.lichcity.entity.vo.result.data.EntityResult
	 */
	Result createSuccessResult(BaseResultData data);


	/***
	 * description:创建未授权返回结果
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param
	 * @return com.shaka.lichcity.entity.vo.result.Result
	 */
	Result createUnauthorizedResult();

	/****
	 * description:创建未认证返回结果
	 * @author yuanzhen
	 * @date 2020/1/14
	 * @param
	 * @return com.shaka.lichcity.entity.vo.result.Result
	 */
	Result createUncertifiedResult();
}
