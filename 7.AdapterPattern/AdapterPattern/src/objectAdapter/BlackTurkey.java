package objectAdapter;

/**
 * 类名:     BlackTurkey
 * 描述:
 * 隶属于:   AdapterPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class BlackTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Turkey");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }
}
