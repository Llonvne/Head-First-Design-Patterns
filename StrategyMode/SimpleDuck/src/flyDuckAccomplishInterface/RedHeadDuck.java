package flyDuckAccomplishInterface;

/**
 * 类名:     RedHeadDuck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("我是红头鸭");
    }

    @Override
    public void fly() {
        System.out.println("红头鸭子飞");
    }

    @Override
    public void quack() {
        System.out.println("红头鸭子叫");
    }

}
