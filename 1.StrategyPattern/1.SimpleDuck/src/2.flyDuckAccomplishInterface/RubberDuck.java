package flyDuckAccomplishInterface;

/**
 * 类名:     RubberDuck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("橡皮鸭叫");
    }
}
