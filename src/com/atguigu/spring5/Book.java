package com.atguigu.spring5;

/**
 * @author kasio
 * @create 2021-10-27 0:09
 * 演示使用set方法进行注入属性
 */
public class Book {

    //①创建属性
    private String bName;
    private String bAuthor;
    private String address;
    //②创建属性对应的set方法
    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) { this.bAuthor = bAuthor; }

    public void setAddress(String address) { this.address = address; }

    public void testDemo(){
        System.out.println(bName + "::" + bAuthor + "::" + address);
    }
}
