package com.sunao.abstract0.factory;

/**
 * ProductA1 产品A1
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:47
 */
public class ProductA1 extends AbstractProductA {
    /**
     * 每个产品相同的方法，不同实现
     */
    @Override
    public void doSomething() {
        System.out.println("产品A1的实现方法");
    }
}
