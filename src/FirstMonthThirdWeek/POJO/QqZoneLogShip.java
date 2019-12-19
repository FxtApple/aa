package POJO;

import lombok.Data;

import java.util.Date;

@Data
public class QqZoneLogShip {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * 空间id
     * */
    private Integer qqZoneId;
    /**
     * 日志id
     * */
    private Integer lodId;
    /**
     * 发表日志日期
     * */
    private Date createTime;

}
