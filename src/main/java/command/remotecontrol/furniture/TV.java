package command.remotecontrol.furniture;

/**
 * @author neilz
 * @create 2020/5/26 15:21
 */
public class TV {
    private String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "TV is on !! ");
    }
    public void off() {
        System.out.println(location + "TV is off !! ");
    }
}
