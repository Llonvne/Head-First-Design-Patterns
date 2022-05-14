package flyDuckAccomplishInterface;

/**
 * 类名:     MallarDuck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class MallarDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("我是 Mallar");
    }

    @Override
    public void fly() {
        System.out.println("Mallor Flying...");
    }

    @Override
    public void quack() {
        System.out.println("Mallor Quarking");
    }
}
