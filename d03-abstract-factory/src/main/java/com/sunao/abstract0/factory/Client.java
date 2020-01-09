package com.sunao.abstract0.factory;

/**
 * Client 场景类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:55
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        //产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        //产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        //产生B2对象
        AbstractProductB b2 = creator2.createProductB();
    }
}
