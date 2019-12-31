package com.test.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangxiaoguang
 * @create 2019-12-31 15:57
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //		pre：路由之前
//		routing：路由之时
//		post： 路由之后
//		error：发送错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(request.getMethod() + "--" + request.getRequestURL().toString());
        Object username = request.getParameter("username");
        if (username != null && "fymod".equals(username.toString())) {
            ctx.setSendZuulResponse(false);
            try {
                ctx.getResponse().setContentType("text/html;charset=utf-8");
                ctx.getResponse().getWriter().write("监控到用户名是fymod");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;

    }
}
