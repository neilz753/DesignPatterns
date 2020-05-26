package command.remotecontrol.furniture;

/**
 * 厂商Light类
 *
 * @author neilz
 * @create 2020/5/25 16:03
 */
public class Light {

    private String tag;

    public Light(String tag) {
        this.tag = tag;
    }

    public void on() {
        System.out.println(tag + "Light is on !! ");
    }
    public void off() {
        System.out.println(tag + "Light is off !! ");
    }
}
