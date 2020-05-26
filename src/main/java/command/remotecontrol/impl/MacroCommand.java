package command.remotecontrol.impl;

import command.remotecontrol.Command;

/**
 * 宏命令，可批量执行命令
 *
 * @author neilz
 * @create 2020/5/26 15:16
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
