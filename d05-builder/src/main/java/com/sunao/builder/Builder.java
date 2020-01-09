package com.sunao.builder;

/**
 * Builder 抽象建造者
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 14:03
 */
public abstract class Builder {
    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     *
     * @return 产品
     */
    public abstract Product buildProduct();
}
