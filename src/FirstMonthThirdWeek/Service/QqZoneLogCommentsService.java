package Service;

import DAO.ConnectOp;
import POJO.QqZoneLogComments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface QqZoneLogCommentsService {

    public Integer addQqZoneComments(QqZoneLogComments qqZoneComments);

    public Integer deleteQqZoneComments(int id);

    public Integer updateQqZoneLogComments(int writerId,String comments);

    public List<QqZoneLogComments> selectQqZoneLogComments(int writerId);
}
