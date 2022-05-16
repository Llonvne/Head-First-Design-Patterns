package PizzaStore;

/**
 * 类名:     PizzaStore.XSDoubleChessPizza
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class XSDoubleChessPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("PizzaStore.XSDoubleChessPizza");
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
