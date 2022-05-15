package strategyMode;

import strategyMode.duckBehaviors.flyBehaviors.FlyWithWings;
import strategyMode.duckBehaviors.quackBehaviors.Quack;

/**
 * 类名:     MallarDuck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void display() {
        System.out.println("MollarDuck");
    }
}
