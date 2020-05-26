package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.furniture.GarageDoor;

/**
 * @author neilz
 * @create 2020/5/25 16:36
 */
public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
