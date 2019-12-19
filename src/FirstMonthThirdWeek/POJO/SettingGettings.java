package POJO;

import lombok.Data;

@Data
public class SettingGettings {
        private Integer id ;
        private String name;
        private Integer age;

        public static void main(String[] args) {
            SettingGettings sg = new SettingGettings();
            //animal.setAge(8);
            Integer id = sg.getId();
            System.out.println(id);
        }

 }




















