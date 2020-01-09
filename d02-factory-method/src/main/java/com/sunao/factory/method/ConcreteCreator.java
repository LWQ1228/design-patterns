package com.sunao.factory.method;

/**
 * ConcreteCreator
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 9:29
 */
public class ConcreteCreator extends Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当让也可以为空
     *
     * @param c Class参数
     * @return 返回值
     */
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
