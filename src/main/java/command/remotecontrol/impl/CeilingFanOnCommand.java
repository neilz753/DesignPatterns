package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.CeilingFan;

/**
 * @author neilz
 * @create 2020/5/26 10:48
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
