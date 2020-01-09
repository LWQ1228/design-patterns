package com.sunao.template.method;

/**
 * ConcreteClass2 具体模板类2
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 13:19
 */
public class ConcreteClass2 extends AbstractClass {
    /**
     * 是否执行doSomething
     */
    private boolean doSomethingFlag = true;

    /**
     * 基本方法
     */
    @Override
    protected void doSomething() {
        //业务逻辑处理
        System.out.println("执行ConcreteClass2 doSomething");
    }

    /**
     * 基本方法
     */
    @Override
    protected void doAnything() {
        //业务逻辑处理
        System.out.println("执行ConcreteClass2 doAnything");
    }

    /**
     * 判断是否执行doSomething方法
     *
     * @return 判断结果
     */
    @Override
    protected boolean isDoSomething() {
        return this.doSomethingFlag;
    }

    /**
     * 设置doSomethingFlag的值
     *
     * @param doSomethingFlag doSomethingFlag的值
     */
    public void setDoSomethingFlag(boolean doSomethingFlag) {
        this.doSomethingFlag = doSomethingFlag;
    }
}
