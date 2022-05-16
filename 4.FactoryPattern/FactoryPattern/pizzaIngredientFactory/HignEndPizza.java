package pizzaIngredientFactory;

import PizzaStore.Pizza;

import java.util.Arrays;

/**
 * 类名:     SRHignEndPizza
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class HignEndPizza implements Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public HignEndPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare");
        Dough dough = pizzaIngredientFactory.createDough();
        Clams clams = pizzaIngredientFactory.createClam();
        Veggies[] veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(Arrays.toString(veggies));
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
