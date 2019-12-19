package POJO;

import lombok.Data;

import java.util.Date;
@Data
public class QqZoneLogComments {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * 评论内容
     * */
    private String content;
    /**
     * 评论人id
     * */
    private Integer writerId;
    /**
     * 收到人的id
     * */
    private Integer receiveID;

    /**
     * 发表评论时间
     * */
    private Date createDate;
}
