package Service;

import DAO.ConnectOp;
import POJO.QqZoneLog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface QqZoneLogService {

    public Integer addQqZoneLog(QqZoneLog qqZoneLog);

    public Integer deleteQqZoneLog(int id);

    public Integer updateQqZoneLog(QqZoneLog qqZoneLog,int id);

    public List<QqZoneLog> selectQqZoneLog(QqZoneLog qqZoneLog);
}
