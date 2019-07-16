package com.jv.web.tools.JsonOutTool;


import com.fasterxml.jackson.core.JsonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonOutFactory {


    @Autowired
    public static JsonOutTool jsonOutToolLayUi;

    /**
     * 通过set方法去静态注入
     */
    @Autowired
    public void setJsonOutToolLayUi(JsonOutTool jsonOutToolLayUi) {
        JsonOutFactory.jsonOutToolLayUi = jsonOutToolLayUi;
    }


    /**
     * MARK:根据请求端的类型，返回不用的对象结构
     * 目前暂时只有layUi
     */
    public static JsonOutTool getJsonOutTool(){

        return jsonOutToolLayUi;
    }


}
