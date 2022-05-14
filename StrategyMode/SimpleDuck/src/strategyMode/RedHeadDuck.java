package strategyMode;

import strategyMode.duckBehaviors.flyBehaviors.FlyWithWings;
import strategyMode.duckBehaviors.quackBehaviors.Mute;

/**
 * 类名:     RedHeadDuck
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new FlyWithWings(),new Mute());
    }

    @Override
    public void display() {
        System.out.println("ReadHeadDuck");
    }
}
