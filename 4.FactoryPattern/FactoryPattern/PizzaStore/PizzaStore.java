package PizzaStore;

/**
 * 类名:     PizzaStore.PizzaStore
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class PizzaStore {

    //    工厂方法 创建披萨
    abstract protected Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
