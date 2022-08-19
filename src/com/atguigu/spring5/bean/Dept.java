package com.atguigu.spring5.bean;

/**
 * @author kasio
 * @create 2021-10-27 22:12
 * 部门类
 */
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
