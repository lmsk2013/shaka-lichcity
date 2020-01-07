package com.shaka.lichcity.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 袁振
 * @date 2019/10/20 11:07
 * 处理后过滤器
 */
@Component
@Slf4j
public class AfterProcessingFilter extends ZuulFilter {


	@Override
	public String filterType() {
		return FilterConstants.POST_TYPE;
	}

	@Override
	public int filterOrder() {
		// 在请求返回前执行
		return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();

		HttpServletRequest request = ctx.getRequest();
		String uri = request.getRequestURI();

		Long startTiem = (Long)ctx.get("startTime");
		long duration = System.currentTimeMillis() - startTiem ;

		log.info("请求uri: {}, 消耗时间: {}ms", uri, duration/100);

		return null;

	}


}
