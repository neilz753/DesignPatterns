package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.CeilingFan;

/**
 * @author neilz
 * @create 2020/5/26 10:48
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
