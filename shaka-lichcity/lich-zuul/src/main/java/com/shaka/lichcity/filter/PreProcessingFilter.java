package com.shaka.lichcity.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @author 袁振
 * @date 2019/10/18 20:48
 * 预处理过滤器
 */
@Component
public class PreProcessingFilter extends ZuulFilter {

	/***
	 * description:指定过滤器类型
	 * @author yuanzhen
	 * @date 2019/10/18
	 * @param
	 * @return java.lang.String
	 */
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	/***
	 * description:制定filter顺序
	 * @author yuanzhen
	 * @date 2019/10/18
	 * @param
	 * @return int
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/***
	 * description:是否启用过滤器
	 * @author yuanzhen
	 * @date 2019/10/20
	 * @param
	 * @return boolean
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/***
	 * description:过滤器对应方法
	 * @author yuanzhen
	 * @date 2019/10/20
	 * @param
	 * @return java.lang.Object
	 */
	@Override
	public Object run() throws ZuulException {

		// 用于在过滤器之间传递消息
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.set("startTiem",System.currentTimeMillis());

		return null;
	}
}
