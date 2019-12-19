package DAO;

import POJO.QqMember;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QqMemberDao {
    /**
     * 登陆：根据账号和密码进行登陆
     * */
    public QqMember login(String qqMember,String password) {
        String sql = "SELECT * FROM t_member WHERE qqmember = '"+qqMember+"' AND password = '"+password+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        try {
            QqMember qqMember1 = new QqMember();
            while (resultSet.next()) {
                qqMember1.setQqMember(qqMember);
                qqMember1.setPassword(password);
                qqMember1.setImgUrl(resultSet.getString("imgurl"));
                qqMember1.setNickName(resultSet.getString("nick_name"));
                qqMember1.setSex(resultSet.getString("sex"));
            }
            return qqMember1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 增加
     * **/
    public Integer addQqMember(QqMember qqMember){
        String sql = "INSERT INTO t_member(qqmember,password,imgurl,nick_name,sex) VALUES" +
                "('"+qqMember.getQqMember()+"','"+qqMember.getPassword()+"','"+qqMember.getImgUrl()+"','"+qqMember.getNickName()+"','"+qqMember.getSex()+"')";
        return ConnectOp.insert(sql);
    }


    /**
     * 根据qqMember删除
     * */
    public Integer deleteQqMember(String qqMember){
        String sql = "DELETE FROM t_member WHERE qqmember = '"+qqMember+"'";
        return ConnectOp.delete(sql);
    }



    /***
     * 修改:根据qq账号修改昵称
     * */
    public Integer updateQqMember(String qqMember,String nickName){
        String sql = "UPDATE t_member SET nick_name = '"+nickName+"' WHERE qqmember = '"+qqMember+"'";
        return ConnectOp.update(sql);
    }



    /**
     * 根据昵称查询账号
     * **/
    public List<QqMember> selectQqMember(String nickName) {
        String sql = "SELECT * FROM t_member WHERE nick_name LIKE '" +'%'+ nickName+ '%'+"'";
        ResultSet resultSet = ConnectOp.select(sql);
        List<QqMember> list = new ArrayList<>();
        try{
            while (resultSet.next()) {
                QqMember qqMember = new QqMember();
                qqMember.setQqMember(resultSet.getString("qqMember"));
                qqMember.setPassword(resultSet.getString("password"));
                qqMember.setImgUrl(resultSet.getString("imgurl"));
                qqMember.setNickName(resultSet.getString("nick_name"));
                qqMember.setSex(resultSet.getString("sex"));
                list.add(qqMember);
            }
            return list;
        }catch (Exception e){

        }
        return null;
    }

}
