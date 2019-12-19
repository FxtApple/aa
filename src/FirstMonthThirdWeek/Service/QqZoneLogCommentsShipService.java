package Service;

import POJO.QqZoneLogCommentsShip;

public interface QqZoneLogCommentsShipService {
    public Integer addQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip);

    /**
     * 删除
     * */
    public Integer deleteQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip);

    /**
     * 修改
     * */
    public Integer updateQqZoneLogCommectsShip(int logId,int commectId);

    /**
     * 查询
     * */
    public QqZoneLogCommentsShip selectQqZoneLogCommentsShip(QqZoneLogCommentsShip qqZoneLogCommentsShip);
}
