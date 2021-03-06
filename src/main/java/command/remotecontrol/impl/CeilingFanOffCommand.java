package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.CeilingFan;

/**
 * @author neilz
 * @create 2020/5/26 10:48
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    /**
     * 在改变吊扇速度之前，将之前速度记录下来，以便需要撤销时使用。
     */
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
