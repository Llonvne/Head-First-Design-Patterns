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
    private String description = "Unknown";

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 0~Small 1~Medium 2~Large
    private int size = 0;

    public Beverage(String description) {
        this.description = description;
    }

    //    允许初始化直接制定大小，不指定默认为小杯
    public Beverage(int size) {
        this.size = size;
    }

    public Beverage(String description, int size) {
        this.description = description;
        this.size = size;
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
