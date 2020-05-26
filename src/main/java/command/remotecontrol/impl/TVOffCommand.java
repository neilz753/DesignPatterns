package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.TV;

/**
 * @author neilz
 * @create 2020/5/26 15:47
 */
public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
