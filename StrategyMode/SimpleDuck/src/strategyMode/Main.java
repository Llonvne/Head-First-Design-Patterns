package strategyMode;

import strategyMode.duckBehaviors.flyBehaviors.FlyBehavior;
import strategyMode.duckBehaviors.flyBehaviors.FlyNoWay;
import strategyMode.duckBehaviors.flyBehaviors.FlyWithWings;
import strategyMode.duckBehaviors.quackBehaviors.Quack;
import strategyMode.duckBehaviors.quackBehaviors.QuackBehavior;

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
        Duck mallarDuck = new MallarDuck();
        mallarDuck.peformQuack();
        mallarDuck.peformFly();
        mallarDuck = new RedHeadDuck();
        mallarDuck.peformQuack();
        mallarDuck.peformFly();

//        动态变更行为 通过组合实现运行时多台，而非编译时多态
        mallarDuck.setFlyBehaviors(new FlyNoWay());
        mallarDuck.peformFly();
    }
}
