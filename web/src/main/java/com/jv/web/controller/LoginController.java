package com.jv.web.controller;

import com.jv.sysmanager.entity.SecOperator;
import com.jv.sysmanager.service.SecOperatorService;
import com.jv.web.root.RootController;
import com.jv.web.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/login")
@Controller
@Slf4j
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private SecOperatorService operatorService;

    @RequestMapping(value = "/login")
    public ModelAndView loginPage(ModelAndView modelAndView) {
        modelAndView.setViewName("/templates/login/login");

        List<String> userList=new ArrayList<String>();
        userList.add("admin");
        userList.add("user1");
        userList.add("user2");
        loginService.loginPage();
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }


    @RequestMapping(value = "/findOpById")
    public ModelAndView findOperatorById(ModelAndView modelAndView2) {
        modelAndView2.setViewName("/templates/login/login");

       SecOperator operator = operatorService.getOperatorById(1);
       log.info("operator = " + operator.getOperatorName());
        loginService.loginPage();
        return modelAndView2;
    }


    /**
     * 登录
     *  对于参数：SecOperator operator
     *  无论是使用表单提交还是使用ajax提交，data为json字符串。只要对应的属性，可以Operator 的属性对应上，就可以。
     */
    @PostMapping(value = "/doLogin")
    @ResponseBody
    public Map doLogin(ModelAndView modelAndView, @ModelAttribute("operator") SecOperator operator, HttpServletRequest request, HttpServletResponse response) throws IOException {

        Map returnMap = new HashMap();

        SecOperator dataSourceOper = operatorService.getOperatorById(operator.getOperatorId());


        if(StringUtils.pathEquals(dataSourceOper.getPassword(),operator.getPassword())){

//            response.sendRedirect("/index");
//            modelAndView.re("/templates/index");
            log.error("成功成功！！");
            returnMap.put("msg","登录成功！");
            returnMap.put("code","0");
            returnMap.put("url","/index");
            request.getSession().setAttribute("user",operator);

            /**
             *重定向
             */
//            modelAndView.setViewName("redirect:/index");
//            return modelAndView;

        }else {
            log.error("登录失败！");
            returnMap.put("msg","登录失败！");
            returnMap.put("code","-1");
//            modelAndView.addObject("msg","登录失败！");

//            return modelAndView;
        }

        return returnMap;

    }




}
