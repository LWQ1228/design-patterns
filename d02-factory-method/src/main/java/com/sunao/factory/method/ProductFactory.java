package com.sunao.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * ProductFactory 延迟加载的工厂类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 9:57
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        //如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }

            //同时把对象放到缓存容器中
            prMap.put(type, product);
        }
        return product;
    }
}
