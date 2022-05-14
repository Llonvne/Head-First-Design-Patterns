package strategyMode.duckBehaviors.flyBehaviors;

/**
 * 类名:     FlyWithWings
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("用翅膀飞...");
    }
}
