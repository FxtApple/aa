package DAO;

import POJO.QqZoneMemberShip;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QqZoneMemberShipDao {
    /**
     * 增加
     * */
    public Integer addQqZoneMemeberShip(QqZoneMemberShip qqZoneMemberShip){
        String sql = "INSERT INTO t_member_zone_ship(member_id,zone_id)VALUES('"+qqZoneMemberShip.getMenberId()+"','"+qqZoneMemberShip.getZoneId()+"')";
        return ConnectOp.insert(sql);
    }


    /**
    *删除:根据memberId删除记录
    * */
    public Integer deleteQqZoneMemberShip(int memberId){
        String sql = "DELETE FROM t_member_ship WHERE member_id = 'memberId'";
        return ConnectOp.delete(sql);
    }



    /**
     *修改
     * */
    public Integer updateQqZoneMemberShip(int memberId,int zoneId){
        String sql = "UPDATE t_member_zone_ship SET zoneId = 'zoneId' WHERE memberId = 'memberId'";
        return ConnectOp.update(sql);
    }


    /**
     *查询
     * */
    public QqZoneMemberShip selectQqZoneMemberShip(QqZoneMemberShip qqZoneMemberShip){
        String sql = "SELECT * FROM t_member_zone_ship WHERE member_id = '"+qqZoneMemberShip.getMenberId()+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        try {
            QqZoneMemberShip qqZoneMemberShip1 = new QqZoneMemberShip();
            while (resultSet.next()){
                qqZoneMemberShip1.setMenberId(qqZoneMemberShip.getMenberId());
                qqZoneMemberShip1.setZoneId(resultSet.getInt("zoneId"));
            }
            return qqZoneMemberShip1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        QqZoneMemberShipDao qqZoneMemberShipDao = new QqZoneMemberShipDao();
        for (int i = 0; i < 10; i++) {
            QqZoneMemberShip qqZoneMemberShip = new QqZoneMemberShip();
            qqZoneMemberShip.setMenberId((int) (Math.random()*10000));
            qqZoneMemberShip.setZoneId((int) (Math.random()*10000));
            Integer result = qqZoneMemberShipDao.addQqZoneMemeberShip(qqZoneMemberShip);
            System.out.println(result);
        }
    }
}
