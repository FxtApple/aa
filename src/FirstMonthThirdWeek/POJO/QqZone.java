package POJO;

import lombok.Data;

import java.util.List;
@Data
public class QqZone {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * qq空间名称
     * */
    private String zoneName;
    /**
     * qq空间背景图
     * */
    private String backGroundPicture;
    /**
     * qq秀
     * */
    private String qqShortPhoto;

    private List<QqZone> list;
}
