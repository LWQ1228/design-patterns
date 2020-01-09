package com.sunao.factory.method;

/**
 * Creator 抽象工厂类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 9:26
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当让也可以为空
     *
     * @param c   Class参数
     * @param <T> 泛型参数
     * @return 返回值
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
