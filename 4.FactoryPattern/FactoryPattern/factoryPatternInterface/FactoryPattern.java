package factoryPatternInterface;

/**
 * 类名:     FactoryPattern
 * 描述:
 * 隶属于:   FactoryPattern
 * 建立事件： 2022/5/16
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
abstract public class FactoryPattern {
//    调用子类调创建对象，可以增加参数来限定类型
    abstract protected Product createPizza();

    // 工厂对外部调用接口
    public final Product getProduct(){
//        ...
        return null;
    }

}
