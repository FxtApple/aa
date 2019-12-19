package DAO;

import POJO.QqZoneLogComments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QqZoneLogCommentsDao {
    /**
     * 增加
     * */
    public Integer addQqZoneComments(QqZoneLogComments qqZoneComments){
        String sql = "INSERT INTO t_log_content(content,writer_id,receive_id,create_time)VALUES" +
                "('"+qqZoneComments.getContent()+"','"+qqZoneComments.getWriterId()+"','"+qqZoneComments.getReceiveID()+"',now())";
        return ConnectOp.insert(sql);
    }
    /**
     * 删除:根据写评论人id删除记录
     * */
    public Integer deleteQqZoneComments(int id){
        String sql = "DELETE FROM t_log_content WHERE write_id = 'id'";
        return ConnectOp.delete(sql);
    }

    /**
     * 修改：根据评论人id修改评论
     * */
    public Integer updateQqZoneLogComments(int writerId,String comments){
        String sql = "UPDATE t_log_content SET content = 'comments' WHERE writer_id = 'writerId'";
        return ConnectOp.update(sql);
    }


    /**
     * 查询:根据评论人id查询
     * */
    public List<QqZoneLogComments> selectQqZoneLogComments(int writerId){
        String sql = "SELECT * FROM t_log_content WHERE writer_id = 'writerId'";
        ResultSet resultSet = ConnectOp.select(sql);
        List<QqZoneLogComments> list = new ArrayList<QqZoneLogComments>();
        try {
            while(resultSet.next()){
                QqZoneLogComments qqZoneLogComments = new QqZoneLogComments();
                qqZoneLogComments.setContent(resultSet.getString("content"));
                qqZoneLogComments.setReceiveID(resultSet.getInt("receiveID"));
                qqZoneLogComments.setWriterId(resultSet.getInt("writerId"));
                list.add(qqZoneLogComments);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        QqZoneLogCommentsDao qqZoneLogCommentsDao = new QqZoneLogCommentsDao();
        Integer result;
        for (int i = 0; i < 17; i++) {
            QqZoneLogComments qqZoneLogComments = new QqZoneLogComments();
            qqZoneLogComments.setContent("这是去哪里拍的，好好看？");
            qqZoneLogComments.setWriterId((int) (Math.random()*100));
            qqZoneLogComments.setReceiveID((int) (Math.random()*100));
            result = qqZoneLogCommentsDao.addQqZoneComments(qqZoneLogComments);
            System.out.println(result);
        }

    }
}
