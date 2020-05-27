package command.remotecontrol;

/**
 * lambda 功能接口下使用，接口仅有一个方法
 * 需要有撤销 undo() 就不能用 lambda
 *
 */
public interface CommandLambda {
    public void execute();
}
