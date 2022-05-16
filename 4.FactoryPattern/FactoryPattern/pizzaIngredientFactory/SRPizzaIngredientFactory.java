package pizzaIngredientFactory;

import pizzaIngredientFactory.veggies.Garlic;
import pizzaIngredientFactory.veggies.Mushroom;
import pizzaIngredientFactory.veggies.Onion;

/**
 * 类名:     SRPizzaIngredientFactory
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SRPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new SRDough();
    }

    @Override
    public Sauce createSauce() {
        return new SRSauce();
    }

    @Override
    public Chess createChess() {
        return new SRChess();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Mushroom(),new Garlic(),new Onion()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SRPepperoni();
    }

    @Override
    public Clams createClam() {
        return new SRClams();
    }
}
