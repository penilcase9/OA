package com.jv.base.service;

import com.jv.base.dao.TablesManagerDao;
import com.jv.base.vo.TableColumnMsgVO;
import com.jv.base.vo.TableMsgVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TablesManagerSV {

    @Autowired
    private TablesManagerDao tablesManagerDao;


    @Autowired
    private DataSource dataSource;
    
    /**
     *获取所有的table 列表。
     */
    public List<TableMsgVO> getTableList() throws SQLException {

        List<TableMsgVO> returnList = new ArrayList<>();



        List<String> tableNames = tablesManagerDao.getOATableNames();

        log.error("datasource = " + dataSource);

        for(String name:tableNames){
            TableMsgVO tableMsgVO = new TableMsgVO();
            List<TableColumnMsgVO> columnMsgVOList = new ArrayList<TableColumnMsgVO>();

            List<String> columnNames = tablesManagerDao.getColumnNames(name);
            List<String> columnTypes = tablesManagerDao.getColumnTypes(name);
            List<String> columnComments = tablesManagerDao.getColumnComments(name);


            for(int i = 0; i < columnNames.size();i ++){
                TableColumnMsgVO columnMsgVO = new TableColumnMsgVO();
                columnMsgVO.setColumnName(columnNames.get(i));
                columnMsgVO.setColumnType(columnTypes.get(i));
                columnMsgVO.setColumnCommon(columnComments.get(i));
                columnMsgVOList.add(columnMsgVO);
            }

            tableMsgVO.setColumnMsgVOList(columnMsgVOList);
            tableMsgVO.setTableName(name);

            returnList.add(tableMsgVO);
        }

        return returnList;
    }
}
