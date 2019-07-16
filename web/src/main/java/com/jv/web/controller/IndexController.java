package com.jv.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView){

        log.info("进入 index 页面！");

        modelAndView.setViewName("/templates/index");


        return modelAndView;
    }


    @RequestMapping("/main")
    public ModelAndView mainBody(ModelAndView modelAndView){

        log.info("进入 main 页面！");

        modelAndView.setViewName("/templates/main/main");


        return modelAndView;
    }
}
