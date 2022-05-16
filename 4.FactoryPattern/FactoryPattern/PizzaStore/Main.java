package PizzaStore;

/**
 * 类名:     PizzaStore.Main
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new SRPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("HighEndPizza");
    }
}
