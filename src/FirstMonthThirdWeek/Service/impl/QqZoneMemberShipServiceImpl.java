package Service.impl;

import DAO.QqZoneMemberShipDao;
import POJO.QqZoneMemberShip;
import Service.QqZoneMemberShipService;

public class QqZoneMemberShipServiceImpl implements QqZoneMemberShipService {
    QqZoneMemberShipDao qqZoneMemberShipDao;
    public QqZoneMemberShipServiceImpl(){qqZoneMemberShipDao = new QqZoneMemberShipDao();}

    /**
     * 增加
     * */
    @Override
    public Integer addQqZoneMemeberShip(QqZoneMemberShip qqZoneMemberShip) {
        return qqZoneMemberShipDao.addQqZoneMemeberShip(qqZoneMemberShip);
    }

    /**
     *删除:根据memberId删除记录
     * */
    @Override
    public Integer deleteQqZoneMemberShip(int memberId) {
        return qqZoneMemberShipDao.deleteQqZoneMemberShip(memberId);
    }

    /**
     *修改
     * */
    @Override
    public Integer updateQqZoneMemberShip(int memberId, int zoneId) {
        return qqZoneMemberShipDao.updateQqZoneMemberShip(memberId,zoneId);
    }

    /**
     *查询
     * */
    @Override
    public QqZoneMemberShip selectQqZoneMemberShip(QqZoneMemberShip qqZoneMemberShip) {
        return qqZoneMemberShipDao.selectQqZoneMemberShip(qqZoneMemberShip);
    }
}
