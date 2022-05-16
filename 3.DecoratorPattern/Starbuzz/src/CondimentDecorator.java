/**
 * 类名:     CondimentDecorator
 * 描述:
 * 隶属于:   Starbuzz
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class CondimentDecorator extends Beverage {

    private final Beverage beverage;
    private double cost;

    public CondimentDecorator(Beverage beverage, String description,double cost) {
        super(description);
        this.beverage = beverage;
        this.cost = cost;
    }

    public final String getDescription() {
        return super.getDescription() + " " + beverage.getDescription();
    }

    public final double getCost() {
        return beverage.getCost() + cost;
    }
}
