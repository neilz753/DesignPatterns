package command.remotecontrol.furniture;

/**
 * 厂商Light类
 *
 * @author neilz
 * @create 2020/5/25 16:03
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "Light is on !! ");
    }
    public void off() {
        System.out.println(location + "Light is off !! ");
    }
}
