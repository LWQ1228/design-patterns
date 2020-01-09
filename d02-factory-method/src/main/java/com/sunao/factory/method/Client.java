package com.sunao.factory.method;

/**
 * Client
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 9:32
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        //继续业务处理
    }
}
