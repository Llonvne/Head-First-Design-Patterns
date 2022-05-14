/**
 * 类名:     Main
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.display();
        duck.quack();
        duck.swim();

        duck = new RedHeadDuck();
        duck.display();
        duck.quack();
        duck.swim();
    }
}
