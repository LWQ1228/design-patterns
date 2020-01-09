package com.sunao.abstract0.factory;

/**
 * AbstractProductA
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 10:45
 */
public abstract class AbstractProductA {
    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {
    }

    /**
     * 每个产品相同的方法，不同实现
     */
    public abstract void doSomething();
}
