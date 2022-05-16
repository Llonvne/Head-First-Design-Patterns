package PizzaStore;

import pizzaIngredientFactory.HignEndPizza;
import pizzaIngredientFactory.PizzaIngredientFactory;
import pizzaIngredientFactory.SRPizzaIngredientFactory;

/**
 * 类名:     PizzaStore.SRPizzaStore
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SRPizzaStore extends PizzaStore{
    PizzaIngredientFactory pizzaIngredientFactory = new SRPizzaIngredientFactory();
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("PizzaStore.SRTomatoPizza")){
            return new SRTomatoPizza();
        }
        else if (type.equals("HighEndPizza")){
            return new HignEndPizza(pizzaIngredientFactory);
        }
        else {
            return new SRDoubleTomatoPizza();
        }
    }
}
