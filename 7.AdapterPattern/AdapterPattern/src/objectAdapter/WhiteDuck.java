package objectAdapter;

/**
 * 类名:     WhiteDuck
 * 描述:
 * 隶属于:   AdapterPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class WhiteDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }

    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}
