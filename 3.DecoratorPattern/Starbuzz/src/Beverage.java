/**
 * 类名:     Beverage
 * 描述:     饮料抽象类
 * 隶属于:   Starbuzz
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class Beverage {
    //    保存描述
    private final String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        /**
         * 描述：该方法对所有饮料类实现，而所有添加料必须重新实现
         * 建立时间： 2022/5/15
         * 参数: []
         * 返回: java.lang.String
         */
        return description;
    }

    //抽象 getCost 方法
    abstract public double getCost();
}
