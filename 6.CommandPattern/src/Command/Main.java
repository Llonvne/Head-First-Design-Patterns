package Command;

import Command.Light.Light;
import Command.Light.LightOffCommand;
import Command.Light.LightOnCommand;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(lightOnCommand);

        simpleRemoteControl.go();

        Command lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOffCommand);

        simpleRemoteControl.go();
    }
}
