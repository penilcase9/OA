package com.jv.base.dao;

import com.jv.common.utils.config.DbConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Component
public class TablesManagerDao {

    @Autowired
    private DbConfig dbConfig;

    @Autowired
    private DataSource dataSource;


    private static final String SQL = "SELECT * FROM ";// 数据库操作


    /**
     *获取 OA 数据库表名。
     * 不包含 工作流引擎等第三方插件表格。
     */
    public List<String> getOATableNames()throws SQLException{
        List<String> dbUsers =  dbConfig.getDbUsersList();
//        List<String> dbUsers =  null;
        Set<String> dbUsersSet = new HashSet<>(dbUsers);

       List<String> returnList = new ArrayList();
       List<String> allTablesNames = getTableNames();


       for(String tableName:allTablesNames){
           if(tableName.indexOf("_" ) > 0){
               String tableHeader = tableName.substring(0,tableName.indexOf("_"));
               if(dbUsersSet.contains(tableHeader)){
                   returnList.add(tableName);
               }
           }

       }
       return returnList;
    }

    /**
     * 获取数据库下的所有表名
     */
    public  List<String> getTableNames() throws SQLException {
        List<String> tableNames = new ArrayList<>();
        Connection conn = dataSource.getConnection();
        ResultSet rs = null;
        try {
            //获取数据库的元数据
            DatabaseMetaData db = conn.getMetaData();
            //从元数据中获取到所有的表名
            rs = db.getTables(null, null, null, new String[] { "TABLE" });
            while(rs.next()) {
                tableNames.add(rs.getString(3));
            }
        } catch (SQLException e) {
            log.error("getTableNames failure", e);
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException e) {
                log.error("close ResultSet failure", e);
            }
        }
        return tableNames;
    }


    /**
     * 获取表中所有字段名称
     * @param tableName 表名
     * @return
     */
    public  List<String> getColumnNames(String tableName) throws SQLException {
        List<String> columnNames = new ArrayList<>();
        //与数据库的连接
        Connection conn = dataSource.getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnNames.add(rsmd.getColumnName(i + 1));
            }
        } catch (SQLException e) {
            log.error("getColumnNames failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    conn.close();
                } catch (SQLException e) {
                    log.error("getColumnNames close pstem and connection failure", e);
                }
            }
        }
        return columnNames;
    }


    /**
     * 获取表中所有字段类型
     * @param tableName
     * @return
     */
    public  List<String> getColumnTypes(String tableName) throws SQLException {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
        Connection conn = dataSource.getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnTypes.add(rsmd.getColumnTypeName(i + 1));
            }
        } catch (SQLException e) {
            log.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    conn.close();

                } catch (SQLException e) {
                    log.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnTypes;
    }

    /**
     * 获取表中字段的所有注释
     * @param tableName
     * @return
     */
    public  List<String> getColumnComments(String tableName) throws SQLException {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
        Connection conn = dataSource.getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        List<String> columnComments = new ArrayList<>();//列名注释集合
        ResultSet rs = null;
        try {
            pStemt = conn.prepareStatement(tableSql);
            rs = pStemt.executeQuery("show full columns from " + tableName);
            while (rs.next()) {
                columnComments.add(rs.getString("Comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    conn.close();

                } catch (SQLException e) {
                    log.error("getColumnComments close ResultSet and connection failure", e);
                }
            }
        }
        return columnComments;
    }



}
