package DAO;
import POJO.QqGroup;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.time.MonthDay.now;


public class QqGroupDao {
    /**
     * 增加
     * */
    public Integer addQqGroup(QqGroup qqGroup){
        String sql="INSERT INTO t_group(group_name,create_time)" +
                "VALUES('"+qqGroup.getGroupName()+"',now())";
        Integer result = ConnectOp.insert(sql);
        return result;
    }
    /**
     * 删除
     * */
    public Integer deleteGroup(QqGroup qqGroup){
        String sql = "DELETE FROM t_group WHERE id = '"+qqGroup.getId()+"'";
        Integer result = ConnectOp.delete(sql);
        return result;
    }
    /***
     * 修改
     * */
    public Integer updateGroup(QqGroup qqGroup){
        String sql = "UPDATE t_group SET group_name = '"+qqGroup.getGroupName()+"' WHERE id = '"+qqGroup.getId()+"'";
        Integer result = ConnectOp.update(sql);
        return result;
    }


    /**
     * 查询
     * */
    public List<QqGroup> selectQqGroup(String groupName){
        String sql = "SELECT * FROM t_group WHERE group_name LIKE '"+groupName+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        List<QqGroup> list = new ArrayList<>();
        try {
            while(resultSet.next()){
                QqGroup qqGroup = new QqGroup();
                qqGroup.setGroupName(resultSet.getString("group_name"));
                qqGroup.setDate(resultSet.getDate("create_time"));
                list.add(qqGroup);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        QqGroupDao qqGroupDao = new QqGroupDao();
            QqGroup qqGroup = new QqGroup();
            qqGroup.setGroupName("柠檬精");
            Integer result = qqGroupDao.addQqGroup(qqGroup);
            System.out.println(result);
    }
}
