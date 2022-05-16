/**
 * 类名:     Singleton
 * 描述:
 * 隶属于:   SingletonPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
