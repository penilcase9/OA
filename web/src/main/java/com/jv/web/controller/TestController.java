package com.jv.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello OA !";
    }

    @RequestMapping("/test/TestFrame")
    public ModelAndView testFrame(ModelAndView modelAndView){

        modelAndView.setViewName("/templates/test/TestFrame");
        return modelAndView;
    }
}
