package com.sunao.abstract0.factory;

/**
 * Creator2 产品等级2的实现类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:52
 */
public class Creator2 extends AbstractCreator {
    /**
     * 只生产产品等级为2的A产品
     *
     * @return 等级为2的A产品
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     *
     * @return 等级为2的B产品
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
