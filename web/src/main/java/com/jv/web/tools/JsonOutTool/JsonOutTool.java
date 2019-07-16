package com.jv.web.tools.JsonOutTool;

import java.util.List;
import java.util.Map;

public interface JsonOutTool {

    /**
     * 返回 json 对象
     * 一般返回这种数据格式给表格（列表）
     */
    public Map createReturnTableMap(List data,int code,int count,String msg);

}
