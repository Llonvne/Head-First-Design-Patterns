package Command;

/**
 * 类名:     NoCommand
 * 描述:
 * 隶属于:   CommandPattern
 * 建立事件： 2022/5/17
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
//        空实现
    }

    @Override
    public void undo() {

    }
}
