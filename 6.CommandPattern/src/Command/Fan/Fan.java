package Command.Fan;

/**
 * 类名:     Fan
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Fan {
    public final static int OFF = 0;
    public final static int LOW = 1;
    public final static int MID = 2;
    public final static int HIGH = 3;

    public void setFanSpeed(int speed) {
        System.out.println("Fan Speed at " + speed);
    }
}
