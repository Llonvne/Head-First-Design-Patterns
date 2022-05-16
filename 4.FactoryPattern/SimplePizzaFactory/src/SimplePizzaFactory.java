import java.util.Objects;

/**
 * 类名:     SimplePizzaFactory
 * 描述:
 * 隶属于:   SimplePizzaFactory
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza;
        if (Objects.equals(type, "ChessPizza")){
            pizza = new ChessPizza();
        }
        else if (Objects.equals(type,"DoubleChessPizza")){
            pizza = new DoubleChessPizza();
        }
        else {
            pizza = new ChessPizza();
        }
        return pizza;
    }
}
