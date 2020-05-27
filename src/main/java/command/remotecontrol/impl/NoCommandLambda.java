package command.remotecontrol.impl;

import command.remotecontrol.Command;
import command.remotecontrol.CommandLambda;

/**
 * 空对象
 * 避免每次检查是否加载命令对象
 *
 * @author neilz
 * @create 2020/5/26 9:36
 */
public class NoCommandLambda implements CommandLambda {
    @Override
    public void execute() {}
}
