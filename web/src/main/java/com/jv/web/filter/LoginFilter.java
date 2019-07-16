package com.jv.web.filter;

import com.jv.sysmanager.entity.SecOperator;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
@WebFilter(filterName = "LoginFilter", urlPatterns = "/*")
@Slf4j
public class LoginFilter extends HttpFilter {
//    Logger logger = LoggerFactory.getLogger("LoginFilter");

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {

        boolean ifOpen = true;
        if(ifOpen){
            super.doFilter(request,response,chain);
            return;
        }


        Set<String> loginLessRequestSet = new HashSet();
        loginLessRequestSet.add("/login/login");
        loginLessRequestSet.add("/login/doLogin");

        /**
         * 静态资源不拦截
         */
        String staticSource1 = "/static";
        String staticSource2 = "/staticResource";


        /**
         *判断是否登录。
         */
        //获取根目录所对应的绝对路径
        String currentURL = request.getRequestURI();
        log.debug("currentUrl  = " + currentURL);
        if(!loginLessRequestSet.contains(currentURL) && currentURL.indexOf(staticSource1) != 0 && currentURL.indexOf(staticSource2) != 0){
            HttpSession session = request.getSession();
            SecOperator operator = (SecOperator) session.getAttribute("user");

            if(operator == null){
                log.info("login filter 未登录，重定向到登录页面！");
                response.sendRedirect("/login/login");
            }
        }

        chain.doFilter(request,response);

    }
}
