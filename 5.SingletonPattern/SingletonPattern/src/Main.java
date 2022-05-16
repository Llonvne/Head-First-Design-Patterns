/**
 * 类名:     Main
 * 描述:
 * 隶属于:   SingletonPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton_ = Singleton.getInstance();
        System.out.println(singleton_);
    }
}
