package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.Stereo;

/**
 * 音响启动命令类
 *
 * @author neilz
 * @create 2020/5/26 10:08
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolum(11);
    }
}
