package Service;

import DAO.ConnectOp;
import POJO.QqGroup;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface QqGroupService {
    /**
     * 增加
     * */
    public Integer addQqGroup(QqGroup qqGroup);
    /**
     * 删除
     * */
    public Integer deleteGroup(QqGroup qqGroup);
    /***
     * 修改
     * */
    public Integer updateGroup(QqGroup qqGroup);


    /**
     * 查询
     * */
    public List<QqGroup> selectQqGroup(String groupName);
}
