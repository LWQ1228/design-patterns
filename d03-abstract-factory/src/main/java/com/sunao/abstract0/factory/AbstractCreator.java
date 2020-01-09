package com.sunao.abstract0.factory;

/**
 * AbstractCreator 抽象工厂类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:51
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     *
     * @return A产品家族
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return B产品家族
     */
    public abstract AbstractProductB createProductB();
}
