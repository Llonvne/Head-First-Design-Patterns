/**
 * 类名:     Main
 * 描述:
 * 隶属于:   Starbuzz
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        // 双奶单豆单抹茶深烘
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Milk(darkRoast);

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.getCost());

        Beverage decaf = new Decaf();
        decaf.setSize(3);
        decaf = new Milk(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription());
        System.out.println(decaf.getCost());
    }
}
