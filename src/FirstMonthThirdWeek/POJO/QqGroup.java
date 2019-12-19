package POJO;

import lombok.Data;

import java.util.Date;

@Data
public class QqGroup {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * 分组名称
     * */
    private String groupName;
    /**
     * 创建分组时间
     * */
    private Date date;

}
