/**
 * 类名:     Main
 * 描述:
 * 隶属于:   SimplePizzaFactory
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("DoubleChessPizza");
        System.out.println(pizza);
    }
}
