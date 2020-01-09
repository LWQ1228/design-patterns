package com.sunao.builder;

/**
 * ConcreteProduct 具体建造者
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 14:05
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();

    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    @Override
    public void setPart() {
        //产品类内的逻辑处理
    }

    /**
     * 建造产品
     *
     * @return 产品
     */
    @Override
    public Product buildProduct() {
        return product;
    }
}
