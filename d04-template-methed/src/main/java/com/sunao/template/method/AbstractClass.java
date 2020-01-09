package com.sunao.template.method;

/**
 * AbstractClass 抽象模板类
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2020/1/9 13:17
 */
public abstract class AbstractClass {
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    final public void templateMethod() {
        //调用基本方法，完成相关的逻辑
        this.doAnything();
        if (this.isDoSomething()) {
            this.doSomething();
        }
    }

    /**
     * 钩子方法
     *
     * @return 是否执行doSomething方法
     */
    protected boolean isDoSomething() {
        return true;
    }
}
