package POJO;

import lombok.Data;

@Data
public class QqMember {
    /**
     * 主键
     * */
    private Integer id;
    /**
     * qq号
     * */
    private String qqMember;
    /**
     * qq密码
     * */
    private String password;
    /**
     * 头像
     * */
    private String imgUrl;
    /**
     *昵称
     * */
     private String nickName;
     /**
     *性别
     */
    private String sex;
}
