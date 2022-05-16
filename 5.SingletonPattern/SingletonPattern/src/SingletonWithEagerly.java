/**
 * 类名:     SingletonWithEagerly
 * 描述:
 * 隶属于:   SingletonPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SingletonWithEagerly {
    //    急迫创建变量， getInstance 速度很快，但是每次承担 创建开销
    private SingletonWithEagerly() {
    }

    private final static SingletonWithEagerly singletonWithSynchronized =
            new SingletonWithEagerly();

    public static SingletonWithEagerly getInstance() {
        return singletonWithSynchronized;
    }
}
