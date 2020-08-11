package com.tk.interceptor;

import com.tk.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuHandlerInterceptor implements HandlerInterceptor {
    @Autowired
    private HomeService homeService;

    @Override
    public boolean preHandle(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse, final Object o) throws Exception {
        httpServletRequest.setAttribute("menu", this.homeService.loadMenu());
        return true;
    }

    @Override
    public void postHandle(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse, final Object o, final ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(final HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse, final Object o, final Exception e) throws Exception {

    }
}
