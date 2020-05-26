package command.remotecontrol;

/**
 * 简易遥控器
 *
 * @author neilz
 * @create 2020/5/25 16:08
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    /**
     * 设置遥控器按钮控制的命令
     * @param command
     */
    public void setCommand(Command command) {
        slot = command;
    }

    /**
     * 当按下遥控器按钮这个方法就会被调用
     */
    public void buttonWasPressed() {
        slot.execute();
    }

}
