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
    private double[] cost = new double[3];

//    允许装饰者制定三个价格，或者一个价格来初始化
    public CondimentDecorator(Beverage beverage, String description, double cost) {
        super(description);
        this.beverage = beverage;
        this.cost[0] = this.cost[1] = this.cost[2] = cost;
    }

    public CondimentDecorator(Beverage beverage, String description, double smallCost, double mediumCost, double largeCost) {
        this(beverage, description, smallCost);
        this.cost[1] = mediumCost;
        this.cost[2] = largeCost;
    }

    public final String getDescription() {
        return super.getDescription() + " " + beverage.getDescription();
    }

//    返回价格时直接返回对应价格
//    这对于具体装饰者毫无变更
    public final double getCost() {
        return this.cost[this.getSize()] + beverage.getCost();
    }
}
