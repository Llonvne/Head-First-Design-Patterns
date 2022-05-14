package flyDuckAccomplishInherit;

/**
 * 类名:     basicDuck.Duck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class Duck {

    public final void quack() {
        /*
          描述：所有鸭子都会呱呱叫，由本类处理
          建立时间： 2022/5/14
          参数: []
          返回: void
         */
        System.out.println("呱呱呱");
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

    // 抽象 Fly方法
    abstract public void fly();
}
