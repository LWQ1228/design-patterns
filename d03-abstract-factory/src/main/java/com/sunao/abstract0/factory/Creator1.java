package com.sunao.abstract0.factory;

/**
 * Creator1 产品等级1的实现类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 11:52
 */
public class Creator1 extends AbstractCreator {
    /**
     * 只生产产品等级为1的A产品
     *
     * @return 等级为1的A产品
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品等级为1的B产品
     *
     * @return 等级为1的B产品
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
