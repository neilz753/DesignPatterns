package command.remotecontrol.furniture;

/**
 * 吊扇
 *
 * @author neilz
 * @create 2020/5/26 10:40
 */
public class CeilingFan {

    private String tag;

    public CeilingFan(String tag) {
        this.tag = tag;
    }

    public void on() {
        System.out.println(tag + "CeilingFan is on !! ");
    }
    public void off() {
        System.out.println(tag + "CeilingFan is off !! ");
    }
}
