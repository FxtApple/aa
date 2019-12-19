package Service.impl;

import DAO.QqGroupDao;
import POJO.QqGroup;
import Service.QqGroupService;

import java.util.List;

public class QqGroupServiceImpl implements QqGroupService {
    QqGroupDao qqGroupDao;
    public QqGroupServiceImpl(){qqGroupDao = new QqGroupDao();}


    //增加
    @Override
    public Integer addQqGroup(QqGroup qqGroup) {
        return qqGroupDao.addQqGroup(qqGroup);
    }

    //删除
    @Override
    public Integer deleteGroup(QqGroup qqGroup) {
        return qqGroupDao.deleteGroup(qqGroup);
    }

    //修改
    @Override
    public Integer updateGroup(QqGroup qqGroup) {
        return qqGroupDao.updateGroup(qqGroup);
    }

    //查询：根据分组名称查询
    @Override
    public List<QqGroup> selectQqGroup(String groupName) {
        return qqGroupDao.selectQqGroup(groupName);
    }
}
