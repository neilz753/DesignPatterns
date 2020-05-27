package command.remotecontrol;

import command.remotecontrol.impl.NoCommand;
import command.remotecontrol.impl.NoCommandLambda;

/**
 * 遥控器
 *
 * @author neilz
 * @create 2020/5/26 9:32
 */
public class RemoteControlLambda {
    CommandLambda[] onCommands;
    CommandLambda[] offCommands;

    /**
     * 实例化并初始化这两个开与关数组
     */
    public RemoteControlLambda() {
        onCommands = new CommandLambda[7];
        offCommands = new CommandLambda[7];

        CommandLambda noCommand = new NoCommandLambda();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置命令
     * @param slot  插槽位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, CommandLambda onCommand, CommandLambda offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
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
        return stringBuffer.toString();
    }
}
