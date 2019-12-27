package com.ittest.springbootjpa.entity;

import javax.persistence.*;

//使用JPA注解进行配置映射关系
@Entity  //说明它是和数据表映射的类
@Table(name = "tbl_user") //指定对应映射的表名，省略默认表名就是类名
public class User {

    @Id //标识主键
    @GeneratedValue(strategy=GenerationType.IDENTITY) //标识自主增长主键
    private Integer id;

    @Column  //标识字段
    private String userName;

    @Column
    private String passWord;

    public User(){

    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
