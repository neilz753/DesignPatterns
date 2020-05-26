package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.TV;

/**
 * @author neilz
 * @create 2020/5/26 15:46
 */
public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

}
