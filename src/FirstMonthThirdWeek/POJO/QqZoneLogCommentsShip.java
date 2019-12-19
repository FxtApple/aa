package POJO;

import lombok.Data;

import java.util.Date;
@Data
public class QqZoneLogCommentsShip {
    private Integer id;
    /**
     * 日志id
     * */
    private Integer logId;
    /**
     * 评论id
     * */
    private Integer commentID;
    /**
     * 创建时间
     * */
    private Date date;
}

