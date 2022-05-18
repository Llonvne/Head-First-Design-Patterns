package objectAdapter;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   AdapterPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new WhiteDuck();
        duck.quack();
        duck.fly();

        duck = new TurkeyAdapter(new BlackTurkey());
        duck.quack();
        duck.fly();
    }
}
