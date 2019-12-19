package POJO;

import lombok.Data;

@Data
public class QqMemberShip {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * 自己qq号的id
     * */
    private Integer qqMemberId;
    /**
     * 朋友qq号的id
     * **/
    private Integer friendId;
    /**
     * 分组id
     * */
    private Integer groupID;
    /**
     * 0特别关注
     * 1拉黑了
     * 2删除
     * */
    private Short status;
}
