package Service;

import POJO.QqZoneLogShip;

public interface QqZoneLogShipService {
    public Integer addQqZoneLogShip(QqZoneLogShip qqZoneLogShip);

    public Integer deleteQqZoneLogShip(int logId);

    public Integer updateQqZoneLogShip(int id,int logId);

    public QqZoneLogShip selectQqZoneLogShip(QqZoneLogShip qqZoneLogShip);
}
