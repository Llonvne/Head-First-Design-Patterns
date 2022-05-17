package Command;

/**
 * 类名:     SimpleRemoteControl
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(Command command) {
        this.slot = command;
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void go() {
        this.slot.execute();
    }
}
