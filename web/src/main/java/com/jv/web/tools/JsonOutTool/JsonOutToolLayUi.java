package com.jv.web.tools.JsonOutTool;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JsonOutToolLayUi implements JsonOutTool{

    /**
     *
     *
     *      根据code 规范返回。
     *
     *
     returnMap = new HashMap();
     *returnMap.put("code",0);
     *returnMap.put("count",functionList.size());
     *returnMap.put("data",functionList);
     *returnMap.put("msg","请求成功！");
     */
    @Override
    public Map createReturnTableMap(List data,int code,int count,String msg) {

        /**
         * 根据code 规范返回。
         */
        Map returnMap = new HashMap();
        returnMap.put("code",code);
        returnMap.put("count",count);
        returnMap.put("data",data);
        returnMap.put("msg",msg);

        return returnMap;
    }
}
