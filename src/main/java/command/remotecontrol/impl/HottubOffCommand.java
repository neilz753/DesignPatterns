package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.Hottub;

/**
 * @author neilz
 * @create 2020/5/26 15:47
 */
public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }

}
