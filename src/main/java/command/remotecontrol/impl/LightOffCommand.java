package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.Light;

/**
 * 灯关闭命令
 *
 * @author neilz
 * @create 2020/5/25 16:04
 */
public class LightOffCommand implements Command {

    Light light;

    /**
     * 构造器传入某个电灯对象，以便命令控制
     * @param light 电灯对象
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
