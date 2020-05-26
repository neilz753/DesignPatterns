package command.remotecontrol.furniture;

/**
 * 车库门
 *
 * @author neilz
 * @create 2020/5/25 16:39
 */
public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void open() {
        System.out.println(location + "Open the GarageDoor !!");
    }
    public void close() {
        System.out.println(location + "Close the GarageDoor !!");
    }
}
