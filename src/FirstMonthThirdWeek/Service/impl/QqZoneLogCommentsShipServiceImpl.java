package Service.impl;

import DAO.ConnectOp;
import DAO.LogCommentShipDao;
import POJO.QqZoneLogCommentsShip;
import Service.QqZoneLogCommentsShipService;

import java.sql.ResultSet;

public class QqZoneLogCommentsShipServiceImpl implements QqZoneLogCommentsShipService {
    LogCommentShipDao logCommentShipDao;
    public QqZoneLogCommentsShipServiceImpl(){logCommentShipDao = new LogCommentShipDao();}

    /**
     * 增加
     * */
    public Integer addQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip){
        return logCommentShipDao.addQqZoneLogCommentsShip(qqZoneLogCommentsShip);
    }

    /**
     * 删除
     * */
    public Integer deleteQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip){
        return logCommentShipDao.deleteQqZoneLogCommentsShip(qqZoneLogCommentsShip);
    }

    /**
     * 修改:根据commentId修改logId
     * */
    public Integer updateQqZoneLogCommectsShip(int logId,int commectId){
        return logCommentShipDao.updateQqZoneLogCommectsShip(logId,commectId);
    }

    /**
     * 查询
     * */
    public QqZoneLogCommentsShip selectQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip){
        return logCommentShipDao.selectQqZoneLogCommentsShip(qqZoneLogCommentsShip);
    }
}
