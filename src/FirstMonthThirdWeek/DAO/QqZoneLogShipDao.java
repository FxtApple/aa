package DAO;

import POJO.QqZoneLog;
import POJO.QqZoneLogShip;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QqZoneLogShipDao {
    /**
     * 增加
     * */
    public Integer addQqZoneLogShip(QqZoneLogShip qqZoneLogShip){
        String sql =  "INSERT INTO t_zone_log_ship(qzone_id,log_id,create_time) VALUES('"+qqZoneLogShip.getQqZoneId()+"','"+qqZoneLogShip.getLodId()+"',now())";
        return ConnectOp.insert(sql);
    }


    /**
     *删除:根据log_id删除记录
     * */
    public Integer deleteQqZoneLogShip(int logId){
        String sql = "DELETE FROM t_zone_log_ship WHERE log_id = 'logId'";
        return ConnectOp.delete(sql);
    }


    /**
     *修改
     * */
    public Integer updateQqZoneLogShip(int id,int logId){
        String sql = "UPDATE t_zone_log_ship SET log_id = 'logId' WHERE id = 'id'";
        return ConnectOp.update(sql);
    }



    /**
     *查询:根据log_id查询
     * */
    public QqZoneLogShip selectQqZoneLogShip(QqZoneLogShip qqZoneLogShip){
        String sql = "SELECT * FROM t_zone_log_ship WHERE log_id = '"+qqZoneLogShip.getLodId()+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        try {
            QqZoneLogShip qqZoneLogShip1 = new QqZoneLogShip();
            while (resultSet.next()){
                qqZoneLogShip1.setQqZoneId(resultSet.getInt("qqZoneId"));
                qqZoneLogShip1.setLodId(resultSet.getInt("logId"));
                qqZoneLogShip1.setCreateTime(resultSet.getDate("createTime"));
            }
            return qqZoneLogShip1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        QqZoneLogShipDao qqZoneLogShipDao = new QqZoneLogShipDao();
        for (int i = 0; i < 10; i++) {
            QqZoneLogShip qqZoneLogShip = new QqZoneLogShip();
            qqZoneLogShip.setQqZoneId((int) (Math.random()*10000));
            qqZoneLogShip.setLodId((int) (Math.random()*10000));
            Integer result = qqZoneLogShipDao.addQqZoneLogShip(qqZoneLogShip);
            System.out.println(result);
        }
    }
}
