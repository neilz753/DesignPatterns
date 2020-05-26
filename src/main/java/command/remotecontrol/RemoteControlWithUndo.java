package command.remotecontrol;

import command.remotecontrol.impl.NoCommand;

/**
 * 带撤销功能遥控器
 *
 * @author neilz
 * @create 2020/5/26 11:39
 */
public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /**
     * 实例化并初始化这两个开与关数组
     */
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;

    }

    /**
     * 设置命令
     * @param slot  插槽位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    /**
     * 覆盖String 打印每个插槽和它对应的命令
     * @return
     */
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
