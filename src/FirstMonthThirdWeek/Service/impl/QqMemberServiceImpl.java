package Service.impl;

import DAO.QqMemberDao;
import POJO.QqMember;
import Service.QqMemberService;

import java.util.List;

public class QqMemberServiceImpl implements QqMemberService {
    QqMemberDao qqMemberDao;
    public QqMemberServiceImpl(){qqMemberDao = new QqMemberDao();}


    //登陆
    @Override
    public QqMember login(String qqnumber, String password) {
        QqMember qqNumber = qqMemberDao.login(qqnumber, password);
        return qqNumber;
    }


    //添加
    @Override
    public Integer addQqMember(QqMember qqMember) {
        return qqMemberDao.addQqMember(qqMember);
    }

    //删除
    @Override
    public Integer deleteQqMember(String qqMember) {
        return qqMemberDao.deleteQqMember(qqMember);
    }

    //修改：根据qq账号修改昵称
    @Override
    public Integer updateQqMember(String qqMember, String nickName) {
        return qqMemberDao.updateQqMember(qqMember,nickName);
    }

    //根据昵称查询账号
    @Override
    public List<QqMember> selectQqMember(String nickName) {
        return qqMemberDao.selectQqMember(nickName);
    }
}
