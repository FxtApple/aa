package Service;

import DAO.ConnectOp;
import POJO.QqMemberShip;

import java.sql.ResultSet;

public interface QqMemberShipService {
    /**
     * 增加
     * */
    public Integer addQqMemberShip(QqMemberShip qqMemberShip);

    /***
     * 删除
     * */
    public Integer deleteQqMemberShip(int id);


    /**
     * 修改
     * */
    public Integer updateQqMemberShip(int status);



    /**
     *查询
     * */
    public QqMemberShip findQqMemberShip(QqMemberShip qqMemberShip);
}
