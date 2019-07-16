package com.jv.base.vo;

/**
 * 表的一行 信息
 */
public class TableColumnMsgVO {

    /**
     *columnName
     */
    private String columnName;

    /**
     *columnType
     */
    private String columnType;

    /**
     *columnCommon
     */
    private String columnCommon;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnCommon() {
        return columnCommon;
    }

    public void setColumnCommon(String columnCommon) {
        this.columnCommon = columnCommon;
    }
}
