package strategyMode.duckBehaviors.quackBehaviors;

/**
 * 类名:     Mute
 * 描述:
 * 隶属于:   SimpleDuck
 * 建立事件： 2022/5/14
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Mute implements QuackBehavior {
    public void quack(){
        System.out.println("<<<安静>>>");
    }
}
