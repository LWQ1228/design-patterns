package com.sunao.abstract0.factory;

/**
 * ProductB1 产品B1
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:47
 */
public class ProductB1 extends AbstractProductB {
    /**
     * 每个产品相同的方法，不同实现
     */
    @Override
    public void doSomething() {
        System.out.println("产品A1的实现方法");
    }
}
