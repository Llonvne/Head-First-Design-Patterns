/**
 * 类名:     Whip
 * 描述:
 * 隶属于:   Starbuzz
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
//        super(beverage, "Whip", 0.7);
        super(beverage,"Whip",0.3,0.4,0.5);
    }
}
