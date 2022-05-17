package Command.Fan;

import Command.Command;

/**
 * 类名:     FanCommand
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class FanCommand implements Command {

    private Fan fan;
    public FanCommand(Fan fan){
        this.fan = fan;
    }

    private int speed = 0;

    @Override
    public void execute() {
        speed += 1;
        speed %= 4;
        fan.setFanSpeed(speed);
    }

    @Override
    public void undo() {
        speed = speed + 4 - 1;
        speed %= 4;
        fan.setFanSpeed(speed);
    }
}
