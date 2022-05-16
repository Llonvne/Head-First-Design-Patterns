/**
 * 类名:     SingletonWithSynchronized
 * 描述:
 * 隶属于:   SingletonPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SingletonWithSynchronized {
    private SingletonWithSynchronized() {
    }

    private static SingletonWithSynchronized singletonWithSynchronized;

    //    使用 synchronized 线程安全
    public static synchronized SingletonWithSynchronized getInstance() {
        if (singletonWithSynchronized == null) {
            singletonWithSynchronized = new SingletonWithSynchronized();
        }
        return singletonWithSynchronized;
    }
}
