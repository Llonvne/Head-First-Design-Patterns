package Command.GarageDoor;

import Command.Command;

/**
 * 类名:     GarageDoorOpen
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class GarageDoorOpen implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorOpen(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
