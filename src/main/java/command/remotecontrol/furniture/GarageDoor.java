package command.remotecontrol.furniture;

/**
 * 车库门
 *
 * @author neilz
 * @create 2020/5/25 16:39
 */
public class GarageDoor {

    private String tag;

    public GarageDoor(String tag) {
        this.tag = tag;
    }

    public void open() {
        System.out.println(tag + "Open the GarageDoor !!");
    }
    public void close() {
        System.out.println(tag + "Close the GarageDoor !!");
    }
}
