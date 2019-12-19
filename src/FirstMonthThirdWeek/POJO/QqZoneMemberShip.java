package POJO;

import lombok.Data;

@Data
public class QqZoneMemberShip {
    private Integer id;
    /**
     * qq号id
     * */
    private Integer menberId;
    /***
     * 空间Id
     * */
    private Integer zoneId;
}
