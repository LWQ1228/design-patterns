package com.sunao.abstract0.factory;

/**
 * ProductB2 产品B2
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:48
 */
public class ProductB2 extends AbstractProductB {
    /**
     * 每个产品相同的方法，不同实现
     */
    @Override
    public void doSomething() {
        System.out.println("产品A2的实现方法");
    }
}
