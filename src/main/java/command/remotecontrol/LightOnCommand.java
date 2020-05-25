package command.remotecontrol;

/**
 * 灯开启命令
 *
 * @author neilz
 * @create 2020/5/25 16:04
 */
public class LightOnCommand implements Command {

    Light light;

    /**
     * 构造器传入某个电灯对象，以便命令控制
     * @param light 电灯对象
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
