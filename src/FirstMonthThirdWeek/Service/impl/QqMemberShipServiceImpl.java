package Service.impl;

import DAO.QqMemberShipDao;
import POJO.QqMemberShip;
import Service.QqMemberService;
import Service.QqMemberShipService;

public class QqMemberShipServiceImpl implements QqMemberShipService {
    QqMemberShipDao qqMemberShipDao;
    public QqMemberShipServiceImpl(){qqMemberShipDao = new QqMemberShipDao();}

    //增加
    @Override
    public Integer addQqMemberShip(QqMemberShip qqMemberShip) {
        return qqMemberShipDao.addQqMemberShip(qqMemberShip);
    }

    //根据ship中id进行删除
    @Override
    public Integer deleteQqMemberShip(int id) {
        return qqMemberShipDao.deleteQqMemberShip(id);
    }

    //修改好友状态
    @Override
    public Integer updateQqMemberShip(int status) {
        return qqMemberShipDao.updateQqMemberShip(status);
    }

    //查询
    @Override
    public QqMemberShip findQqMemberShip(QqMemberShip qqMemberShip) {
        return qqMemberShipDao.findQqMemberShip(qqMemberShip);
    }
}
