package Command;

import Command.GarageDoor.GarageDoor;
import Command.GarageDoor.GarageDoorClose;
import Command.GarageDoor.GarageDoorOpen;
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

        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpen = new GarageDoorOpen(garageDoor);

        simpleRemoteControl.setCommand(garageDoorOpen);

        simpleRemoteControl.go();

        Command garageDoorClose = new GarageDoorClose(garageDoor);

        simpleRemoteControl.setCommand(garageDoorClose);

        simpleRemoteControl.go();


        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(garageDoorOpen,garageDoorClose,0);
        remoteControl.setCommand(lightOnCommand,lightOffCommand,1);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(1);

        remoteControl.undo();
    }
}
