package com.jv.web.controller;

import com.github.pagehelper.PageHelper;
import com.jv.base.service.TablesManagerSV;
import com.jv.base.vo.TableMsgVO;
import com.jv.sysmanager.entity.SecFunction;
import com.jv.web.tools.JsonOutTool.JsonOutFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
public class BaseController {

    @Autowired
    private TablesManagerSV tablesManagerSV;

    @RequestMapping("/base/tableMsgList")
    @ResponseBody
    public Map getOATableMsg() throws Exception {

        List<TableMsgVO> tableList = tablesManagerSV.getTableList();
        /**
         * 根据code 规范返回。
         */
        Map jsonMap = JsonOutFactory.getJsonOutTool().createReturnTableMap(tableList,0,tableList.size(),"请求成功！");


        return jsonMap;
    }
}
