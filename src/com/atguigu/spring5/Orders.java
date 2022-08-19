package com.atguigu.spring5;

/**
 * @author kasio
 * @create 2021-10-27 0:28
 * 使用有参构造注入
 */
public class Orders {
    //属性
    private String oName;
    private String address;

    //有参数构造
    public Orders(String oName, String address){
        this.oName = oName;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oName + "::" + address);
    }
}