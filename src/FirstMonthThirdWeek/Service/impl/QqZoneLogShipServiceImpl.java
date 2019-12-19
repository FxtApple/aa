package Service.impl;

import DAO.ConnectOp;
import DAO.QqZoneLogShipDao;
import POJO.QqZoneLogShip;
import Service.QqZoneLogShipService;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QqZoneLogShipServiceImpl implements QqZoneLogShipService {
    QqZoneLogShipDao qqZoneLogShipDao;
    public QqZoneLogShipServiceImpl(){qqZoneLogShipDao = new QqZoneLogShipDao();}

    /**
     * 增加
     * */
    public Integer addQqZoneLogShip(QqZoneLogShip qqZoneLogShip){
        return qqZoneLogShipDao.addQqZoneLogShip(qqZoneLogShip);
    }


    /**
     *删除:根据log_id删除记录
     * */
    public Integer deleteQqZoneLogShip(int logId){
       return qqZoneLogShipDao.deleteQqZoneLogShip(logId);
    }


    /**
     *修改
     * */
    public Integer updateQqZoneLogShip(int id,int logId){
        return qqZoneLogShipDao.updateQqZoneLogShip(id,logId);
    }



    /**
     *查询:根据log_id查询
     * */
    public QqZoneLogShip selectQqZoneLogShip(QqZoneLogShip qqZoneLogShip){
        return qqZoneLogShipDao.selectQqZoneLogShip(qqZoneLogShip);
    }
}
