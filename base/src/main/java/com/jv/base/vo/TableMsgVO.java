package com.jv.base.vo;

import java.util.List;

/**
 * 表信息。
 */
public class TableMsgVO {

    /**
     *tableName
     */
    private String tableName;

    /**
     * columnVOList
     */
    private List<TableColumnMsgVO> columnMsgVOList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<TableColumnMsgVO> getColumnMsgVOList() {
        return columnMsgVOList;
    }

    public void setColumnMsgVOList(List<TableColumnMsgVO> columnMsgVOList) {
        this.columnMsgVOList = columnMsgVOList;
    }
}
