package com.jv.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jv.sysmanager.entity.SecFunction;
import com.jv.sysmanager.service.SecFunctionService;
import com.jv.web.tools.JsonOutTool.JsonOutFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/function")
public class FunctionController {


    @Autowired
    private SecFunctionService functionService;

    @RequestMapping("/functionIndex")
    public ModelAndView mainBody(ModelAndView modelAndView){


        modelAndView.setViewName("/templates/sec/function/function");
//        modelAndView.setViewName("/templates/main/main");


        return modelAndView;
    }

    @RequestMapping("/functionList")
    @ResponseBody
    public Map functionList(ModelAndView modelAndView){

          PageHelper.startPage(1, 10);

        List<SecFunction> functionList = functionService.getFunctionList();
        PageHelper.startPage(1,2);

        PageInfo<SecFunction> pageInfo = new PageInfo<SecFunction>(functionList);

        List<SecFunction> newList = pageInfo.getList();
        /**
         * 根据code 规范返回。
         */
         Map jsonMap = JsonOutFactory.getJsonOutTool().createReturnTableMap(newList,0,functionList.size(),"请求成功！");
        return jsonMap;

    }

    @RequestMapping("/functionEditPage")
    @ResponseBody
    public ModelAndView functionEditPage(ModelAndView modelAndView){

        modelAndView.setViewName("/templates/sec/function/functionEditPage");

        return modelAndView;
    }
}
