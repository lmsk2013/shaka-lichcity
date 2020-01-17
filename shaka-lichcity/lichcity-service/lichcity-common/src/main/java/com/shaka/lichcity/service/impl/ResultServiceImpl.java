package com.shaka.lichcity.service.impl;

import com.shaka.lichcity.contants.ResultCodeEnum;
import com.shaka.lichcity.pojo.vo.result.Result;
import com.shaka.lichcity.pojo.vo.result.data.BaseResultData;
import com.shaka.lichcity.service.ResultService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 袁振
 * @date 2020/1/14 19:29
 */
@Service
public class ResultServiceImpl implements ResultService {

	@Value("${path.login}")
	private String loginPath;

	@Value("${path.authorized}")
	private String authorizedPath;

	@Override
	public Result createFailReuslt(String errorMsg) {
		return Result.builder()
				.code(ResultCodeEnum.FAIL.getCode())
				.data(new BaseResultData(errorMsg))
				.build();
	}

	@Override
	public Result createSuccessResult(BaseResultData data) {
		return Result.builder()
				.code(ResultCodeEnum.SUCCESS.getCode())
				.data(data)
				.build();
	}

	@Override
	public Result createUnauthorizedResult() {
		return Result.builder()
				.code(ResultCodeEnum.UNAUTHORIZED.getCode())
				.data(new BaseResultData(authorizedPath))
				.build();
	}

	@Override
	public Result createUncertifiedResult() {
		return Result.builder()
				.code(ResultCodeEnum.UNCERTIFIED.getCode())
				.data(new BaseResultData(loginPath))
				.build();
	}
}
