package DAO;

import POJO.QqZone;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QqZoneDao {
    /**
     * 增加
     * */
    public Integer addQqZone(QqZone qqZone){
        String sql = "INSERT INTO t_zone(zone_name,background_pictuer,qqshow_photo) VALUES " +
                "('"+qqZone.getZoneName()+"','"+qqZone.getBackGroundPicture()+"','"+qqZone.getQqShortPhoto()+"')";
        return ConnectOp.insert(sql);
    }

    /**
     * 删除
     * */
    public Integer deleteQqZone(int id){
        String sql = "DELETE FROM t_zone WHERE id = 'id'";
        return ConnectOp.delete(sql);
    }


    /**
     * 修改
     * **/
    public Integer updateQqZone(String zoneName,String backgroundPicture){
        String sql = "UPDATE t_zone SET background_picture = 'backgroundPicture' WHERE zone_name = '"+zoneName+"'";
        return ConnectOp.update(sql);
    }


    /**
     * 查询
     * */
    public List<QqZone> findQqZone(String zoneName){
        String sql = "SELECT * FROM t_zone WHERE zone_name LIKE 'zoneName'";
        List<QqZone> list = new ArrayList<QqZone>();
        ResultSet resultSet = ConnectOp.select(sql);
        try {
            while(resultSet.next()){
                QqZone qqZone = new QqZone();
                qqZone.setZoneName(resultSet.getString("zoneName"));
                qqZone.setBackGroundPicture(resultSet.getString("backGroundPicture"));
                qqZone.setQqShortPhoto(resultSet.getString("qqShortPhoto"));
                list.add(qqZone);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        QqZoneDao qqZoneDao = new QqZoneDao();

        //增加
        Integer result;
        for (int i = 0; i < 10; i++) {
            QqZone qqZone = new QqZone();
            qqZone.setQqShortPhoto(UUID.randomUUID().toString());
            qqZone.setZoneName(UUID.randomUUID().toString());
            qqZone.setBackGroundPicture(UUID.randomUUID().toString());
            result = qqZoneDao.addQqZone(qqZone);
            System.out.println(result);
        }
    }
}
