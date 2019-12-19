package Service;

import POJO.QqMember;

import java.util.List;

public interface QqMemberService {
    /**
     * 登陆
     * */
    public QqMember login(String qqNumber,String password);

    /**
     * 添加好友
     * **/
    public Integer addQqMember(QqMember qqMember);


    /**
     * 删除好友:根据qqMember删除
     * **/
    public Integer deleteQqMember(String qqMember);


    /***
     * 修改:根据qq账号修改昵称
     * */
    public Integer updateQqMember(String qqMember,String nickName);

    /**
     * 根据昵称查询账号
     * **/
    public List<QqMember> selectQqMember(String nickName);
}
