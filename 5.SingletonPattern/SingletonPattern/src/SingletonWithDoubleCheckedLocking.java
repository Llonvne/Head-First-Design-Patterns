/**
 * 类名:     SingletonWithDoubleCheckedLocking
 * 描述:
 * 隶属于:   SingletonPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SingletonWithDoubleCheckedLocking {
    private volatile static SingletonWithDoubleCheckedLocking uniqueInstance;
    private SingletonWithDoubleCheckedLocking(){}
    public static SingletonWithDoubleCheckedLocking getInstance() {
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new SingletonWithDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
