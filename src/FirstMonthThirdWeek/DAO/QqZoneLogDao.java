package DAO;

import POJO.QqZoneLog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QqZoneLogDao {
    /**
     *增加
     * */
    public Integer addQqZoneLog(QqZoneLog qqZoneLog){
        String sql = "INSERT INTO t_zone_log(title,content,create_date)VALUES('"+qqZoneLog.getTitle()+"','"+qqZoneLog.getLogContent()+"',now())";
        return  ConnectOp.insert(sql);
    }


    /**
     *删除:根据id删除空间日志
     * */
    public Integer deleteQqZoneLog(int id) {
        String sql = "DELETE From t_zone_log WHERE id = 'id'";
        return ConnectOp.delete(sql);
    }


    /**
     *修改:根据id修改空间日志标题
     * */
    public Integer updateQqZoneLog(QqZoneLog qqZoneLog,int id){
        String sql = "UPDATE t_zone_log SET title = '"+qqZoneLog.getTitle()+"' WHERE id = 'id'";
        return ConnectOp.delete(sql);
    }


    /**
     *查询:根据标题查询
     * */
    public List<QqZoneLog> selectQqZoneLog(QqZoneLog qqZoneLog){
        String sql = "SELECT * FROM t_zone_log WHERE content LIKE '"+ '%' +qqZoneLog.getLogContent()+'%'+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        List<QqZoneLog> qqZoneLogs = new ArrayList<QqZoneLog>();
        try {
            while(resultSet.next()){
                QqZoneLog qqZoneLog1 = new QqZoneLog();
                qqZoneLog1.setTitle(resultSet.getString("title"));
                qqZoneLog1.setLogContent(resultSet.getString("content"));
                qqZoneLogs.add(qqZoneLog1);
            }
            return qqZoneLogs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        QqZoneLogDao qqZoneLogDao = new QqZoneLogDao();

        //增加
       /* Integer result;
        for (int i = 0; i < 10; i++) {
            QqZoneLog qqZoneLog = new QqZoneLog();
            qqZoneLog.setTitle(UUID.randomUUID().toString());
            qqZoneLog.setLogContent(UUID.randomUUID().toString());
            result = qqZoneLogDao.addQqZoneLog(qqZoneLog);
            System.out.println(result);
        }*/

       //查询
        QqZoneLog qqZoneLog = new QqZoneLog();
        qqZoneLog.setLogContent("是");
        List<QqZoneLog> list = new ArrayList<QqZoneLog>();
        qqZoneLogDao.selectQqZoneLog(qqZoneLog);
        System.out.println(list);
    }
}
