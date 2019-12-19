package POJO;

import lombok.Data;

import java.util.Date;
@Data
public class QqZoneLog {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * 日志标题
     * */
    private String title;
    /**
     * 日志内容
     * */
    private String logContent;
    /**
     * 发表日志日期
     * */
    private Date date;
}
