package com.sunao.abstract0.factory;

/**
 * ProductA2 产品A2
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:48
 */
public class ProductA2 extends AbstractProductA {
    /**
     * 每个产品相同的方法，不同实现
     */
    @Override
    public void doSomething() {
        System.out.println("产品A2的实现方法");
    }
}
