package Command.Light;

import Command.Command;

/**
 * 类名:     LightOnCommand
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.on();
    }
}
