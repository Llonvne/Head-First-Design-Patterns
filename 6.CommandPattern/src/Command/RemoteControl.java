package Command;

import java.util.Arrays;
import java.util.Stack;

/**
 * 类名:     RemoteControl
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class RemoteControl {
    private final Command[] commandOn;
    private final Command[] commandOff;
    private final Command noCommand;

    private final Stack<Command> undoStack = new Stack<>();

    public RemoteControl() {
        commandOn = new Command[3];
        commandOff = new Command[3];
        noCommand = new NoCommand();

        Arrays.fill(commandOn, noCommand);
        Arrays.fill(commandOff, noCommand);
    }

    public void setCommand(Command onCommand, Command offCommand, int slot) {
        this.commandOn[slot] = onCommand;
        this.commandOff[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        undoStack.push(commandOn[slot]);
        commandOn[slot].execute();
    }

    public void offButtonPushed(int slot) {
        undoStack.push(commandOff[slot]);
        commandOff[slot].execute();
    }

    public void undo(){
        undoStack.pop().undo();
    }

}
