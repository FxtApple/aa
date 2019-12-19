package Service.impl;

import DAO.QqZoneDao;
import POJO.QqZone;
import Service.QqZoneService;

import java.util.List;

public class QqZoneServiceImpl implements QqZoneService {
    QqZoneDao qqZoneDao;
    public QqZoneServiceImpl(){qqZoneDao = new QqZoneDao();}

    //增加
    @Override
    public Integer addQqZone(QqZone qqZone) {
        return qqZoneDao.addQqZone(qqZone);
    }

    //根据空间id删除
    @Override
    public Integer deleteQqZone(int id) {
        return qqZoneDao.deleteQqZone(id);
    }

    //根据空间名称修改背景图
    @Override
    public Integer updateQqZone(String zoneName,String backgroundPicture) {
        return qqZoneDao.updateQqZone(zoneName,backgroundPicture);
    }

    //根据空间名称查看空间
    @Override
    public List<QqZone> findQqZone(String zoneName) {
        return qqZoneDao.findQqZone(zoneName);
    }
}
