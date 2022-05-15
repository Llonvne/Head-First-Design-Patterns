package strategyMode;

import strategyMode.duckBehaviors.flyBehaviors.FlyBehavior;
import strategyMode.duckBehaviors.quackBehaviors.QuackBehavior;

/**
 * 类名:     Duck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class Duck {

    //  组合行为实例
    private FlyBehavior flyBehaviors;

    public void setFlyBehaviors(FlyBehavior flyBehaviors) {
        this.flyBehaviors = flyBehaviors;
    }

    public void setQuackBehaviors(QuackBehavior quackBehaviors) {
        this.quackBehaviors = quackBehaviors;
    }

    private QuackBehavior quackBehaviors;

    public Duck(FlyBehavior flyBehaviors,QuackBehavior quackBehaviors) {
        this.flyBehaviors = flyBehaviors;
        this.quackBehaviors = quackBehaviors;
    }

    public final void swim() {
        /*
          描述：游泳，由本类处理
          建立时间： 2022/5/14
          参数: []
          返回: void
         */
        System.out.println("游泳～～～");
    }

    //    显示，每个鸭子不同交由子类具体实现
    abstract public void display();

    void peformFly() {
//        委托对象处理
        this.flyBehaviors.fly();
    }

    void peformQuack() {
        this.quackBehaviors.quack();
    }
}
