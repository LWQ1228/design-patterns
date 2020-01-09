package com.sunao.builder;

/**
 * Director 导演类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 14:07
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    /**
     * 构建不同的产品
     *
     * @return
     */
    public Product getAProduct() {
        //设置不同的零件
        builder.setPart();
        //产生不同的产品
        return builder.buildProduct();
    }
}
