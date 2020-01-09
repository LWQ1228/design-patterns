package com.sunao.template.method;

/**
 * Client 场景类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 13:20
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
