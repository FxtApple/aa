package Service;

import DAO.ConnectOp;
import POJO.QqZoneMemberShip;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface QqZoneMemberShipService {

    public Integer addQqZoneMemeberShip(QqZoneMemberShip qqZoneMemberShip);

    public Integer deleteQqZoneMemberShip(int memberId);

    public Integer updateQqZoneMemberShip(int memberId,int zoneId);

    public QqZoneMemberShip selectQqZoneMemberShip(QqZoneMemberShip qqZoneMemberShip);
}
