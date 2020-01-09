package com.sunao.factory.method;

/**
 * Product 抽象产品类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 9:22
 */
public abstract class Product {
    /**
     * 产品类的公共方法
     */
    public void method1() {
        //业务逻辑处理
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
