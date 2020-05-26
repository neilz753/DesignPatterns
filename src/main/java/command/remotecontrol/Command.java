package command.remotecontrol;

public interface Command {
    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
