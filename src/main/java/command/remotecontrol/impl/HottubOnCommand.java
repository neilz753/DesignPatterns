package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.Hottub;

/**
 * @author neilz
 * @create 2020/5/26 15:46
 */
public class HottubOnCommand implements Command {

    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }

}
