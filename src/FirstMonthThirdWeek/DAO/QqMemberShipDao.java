package DAO;

import POJO.QqMemberShip;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class QqMemberShipDao {
    /**
     * 增加
     * */
    public Integer addQqMemberShip(QqMemberShip qqMemberShip){
        String sql = "INSERT INTO t_member_ship(qqmember_id,friend_id,group_id,status) VALUES" +
                "('"+qqMemberShip.getQqMemberId()+"','"+qqMemberShip.getFriendId()+"','"+qqMemberShip.getGroupID()+"','"+qqMemberShip.getStatus()+"')";
        return ConnectOp.insert(sql);
    }

    /***
     * 删除
     * */
    public Integer deleteQqMemberShip(int id){
        String sql = "DELETE FROM t_member_ship WHERE id = 'id'";
        return ConnectOp.delete(sql);
    }


    /**
     * 修改
     * */
    public Integer updateQqMemberShip(int status){
        String sql = "UPDATE t_member_ship SET status WHERE status = 'status'";
        return ConnectOp.update(sql);
    }



    /**
     *查询
     * */
    public QqMemberShip findQqMemberShip(QqMemberShip qqMemberShip){
        String sql = "SELECT * FROM t_member_ship WHERE friend_id = '"+qqMemberShip.getFriendId()+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        try {
            while (resultSet.next()) {
                QqMemberShip qqMemberShip1 = new QqMemberShip();
                qqMemberShip1.setQqMemberId(resultSet.getInt("qqMemberId"));
                qqMemberShip1.setFriendId(qqMemberShip.getFriendId());
                // qqMemberShip1.setFriendId(resultSet.getInt("friendId"));
                qqMemberShip1.setGroupID(resultSet.getInt("groupId"));
                qqMemberShip1.setStatus(resultSet.getShort("status"));
                return qqMemberShip1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            QqMemberShipDao qqMemberShipDao = new QqMemberShipDao();
            QqMemberShip qqMemberShip = new QqMemberShip();
            qqMemberShip.setFriendId((int) (Math.random()*10000));
            qqMemberShip.setQqMemberId((int) (Math.random()*10000));
            qqMemberShip.setGroupID((int) (Math.random()*10));
            qqMemberShip.setStatus((short) 0);
            Integer result = qqMemberShipDao.addQqMemberShip(qqMemberShip);
            System.out.println(result);
        }
    }

}
