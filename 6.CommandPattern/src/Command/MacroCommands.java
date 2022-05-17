package Command;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 类名:     MacroCommands
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class MacroCommands implements Command{

    private final ArrayList<Command> commands;

    public MacroCommands(Command ...commands){
        this.commands = new ArrayList<Command>();
        Collections.addAll(this.commands, commands);
    }

    @Override
    public void execute() {
        for (Command command : this.commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = this.commands.size() - 1; i >= 0; i--){
            commands.get(i).undo();
        }
    }
}
