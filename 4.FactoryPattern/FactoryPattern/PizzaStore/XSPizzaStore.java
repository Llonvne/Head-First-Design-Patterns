package PizzaStore;

/**
 * 类名:     PizzaStore.XSPizzaStore
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class XSPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("PizzaStore.XSChessPizza")){
            return new XSChessPizza();
        }
        else {
            return new XSDoubleChessPizza();
        }
    }
}
