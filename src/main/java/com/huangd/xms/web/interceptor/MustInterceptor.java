package com.huangd.xms.web.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.huangd.xms.domain.Session;
import com.huangd.xms.service.SessionService;

import cn.songm.common.web.Browser;
import cn.songm.common.web.CookieUtils;

public class MustInterceptor implements HandlerInterceptor {

	private static final Logger LOG = LoggerFactory.getLogger(MustInterceptor.class);

	@Resource(name = "sessionService")
    private SessionService sessionService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.info("URI: {}", request.getRequestURI());
		
		Session session = sessionService.report(Browser.getSessionId(request));
        // 写入Cookie
        CookieUtils.addCookie(response, Browser.COOKIE_SESSIONID_KEY, session.getSesId(), 0);
        // 写入消息头
        response.addHeader(Browser.HEADER_SESSIONID_KEY, session.getSesId());
        LOG.info("SessionId: {}", session.getSesId());
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
