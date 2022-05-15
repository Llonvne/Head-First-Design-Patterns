package flyDuckAccomplishInterface;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
//该方法有大量重复 Fly 和 Quark方法。。。
public class Main {
    public static void main(String[] args) {
        Flyable flyDuck = new RedHeadDuck();
        flyDuck.fly();
    }
}
