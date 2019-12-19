package DAO;

import POJO.QqZoneLog;
import POJO.QqZoneLogCommentsShip;
import POJO.QqZoneLogShip;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LogCommentShipDao {
    /**
     * 增加
     * */
    public Integer addQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip){
        String sql = "INSERT INTO t_log_comment_ship(log_id,comment_id,create_date) VALUES("+qqZoneLogCommentsShip.getLogId()+","+qqZoneLogCommentsShip.getCommentID()+",now())";
        Integer result = ConnectOp.insert(sql);
        return result;
    }
    /**
     * 删除
     * */
    public Integer deleteQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip){
        String sql = "DELETE FROM t_log_comment_ship WHERE log_id = '"+qqZoneLogCommentsShip.getLogId()+"' AND comment_id = '"+qqZoneLogCommentsShip.getCommentID()+"'";
        return ConnectOp.delete(sql);
    }



    /**
     * 修改
     * */
    public Integer updateQqZoneLogCommectsShip(int logId,int commectId){
        String sql = "UPDATE t_log_comment_ship SET log_id = "+logId+ " WHERE comment_id = "+commectId+"";
        Integer result = ConnectOp.update(sql);
        return result;
    }

    /**
     * 查询
     * */
    public QqZoneLogCommentsShip selectQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip) {
        String sql = "SELECT * FROM t_log_comment_ship WHERE id = " + qqZoneLogCommentsShip.getId() + "";
        ResultSet resultSet = ConnectOp.select(sql);
        QqZoneLogCommentsShip qqZoneLogCommentsShip1 = new QqZoneLogCommentsShip();
        try {
            while (resultSet.next()) {
                qqZoneLogCommentsShip.setId(resultSet.getInt("id"));
                qqZoneLogCommentsShip1.setLogId(resultSet.getInt("log_id"));
                qqZoneLogCommentsShip1.setCommentID(resultSet.getInt("comment_id"));
                qqZoneLogCommentsShip1.setDate(resultSet.getDate("create_date"));
            }
            return qqZoneLogCommentsShip1;
           // System.out.println(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
       /*增加
       LogCommentShipDao logCommentShipDao = new LogCommentShipDao();
        for (int i = 0; i < 10; i++) {
            QqZoneLogCommentsShip qqZoneLogCommentsShip = new QqZoneLogCommentsShip();
            qqZoneLogCommentsShip.setLogId(i);
            qqZoneLogCommentsShip.setCommentID(++i);
            Integer result = logCommentShipDao.addQqZoneLogCommentsShip(qqZoneLogCommentsShip);
            System.out.println(result);
        }*/

       //查询
      /*  LogCommentShipDao logCommentShipDao = new LogCommentShipDao();
        QqZoneLogCommentsShip qqZoneLogCommentsShip = new QqZoneLogCommentsShip();
        //qqZoneLogCommentsShip.setLogId(2);
        qqZoneLogCommentsShip.setId(3);
        QqZoneLogCommentsShip qqZoneLogCommentsShip1 = new QqZoneLogCommentsShip();
        qqZoneLogCommentsShip1 = logCommentShipDao.selectQqZoneLogCommentsShip(qqZoneLogCommentsShip);
        System.out.println(qqZoneLogCommentsShip1);*/

      //修改
       /* LogCommentShipDao logCommentShipDao = new LogCommentShipDao();
        Integer result = logCommentShipDao.updateQqZoneLogCommectsShip(3,8);
        System.out.println(result);*/

       //删除
        LogCommentShipDao logCommentShipDao = new LogCommentShipDao();
        QqZoneLogCommentsShip qqZoneLogCommentsShip = new QqZoneLogCommentsShip();
        qqZoneLogCommentsShip.setLogId(3);
        qqZoneLogCommentsShip.setCommentID(6);
        Integer result = logCommentShipDao.deleteQqZoneLogCommentsShip(qqZoneLogCommentsShip);
        System.out.println(result);

    }
}
