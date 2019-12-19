package Service;

import POJO.QqZone;

import java.util.List;

public interface QqZoneService {
    /**
     * 增加
     * */
    public Integer addQqZone(POJO.QqZone qqZone);

    /**
     * 删除
     * */
    public Integer deleteQqZone(int id);

    /**
     * 修改
     * **/
    public Integer updateQqZone(String zoneName,String backgroundPicture);


    /**
     * 查询
     * */
    public List<QqZone> findQqZone(String zoneName);
}
