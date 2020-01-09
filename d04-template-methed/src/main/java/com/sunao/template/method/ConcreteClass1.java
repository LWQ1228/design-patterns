package com.sunao.template.method;

/**
 * ConcreteClass1 具体模板类1
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 13:19
 */
public class ConcreteClass1 extends AbstractClass {
    /**
     * 基本方法
     */
    @Override
    protected void doSomething() {
        //业务逻辑处理
        System.out.println("执行ConcreteClass1 doSomething");
    }

    /**
     * 基本方法
     */
    @Override
    protected void doAnything() {
        //业务逻辑处理
        System.out.println("执行ConcreteClass1 doAnything");
    }

    /**
     * 判断是否执行doSomething方法
     *
     * @return 判断结果
     */
    @Override
    protected boolean isDoSomething() {
        return false;
    }
}
