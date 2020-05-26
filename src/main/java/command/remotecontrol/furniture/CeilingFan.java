package command.remotecontrol.furniture;

/**
 * 吊扇
 *
 * @author neilz
 * @create 2020/5/26 10:40
 */
public class CeilingFan {

    /**
     * 新增速度相关控制
     */
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void on() {
        System.out.println(location + "CeilingFan is on !! ");
    }
    public void off() {
        System.out.println(location + "ceiling fan is off !! ");
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + "ceiling fan is on high !! ");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "ceiling fan is on medium !! ");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "ceiling fan is on low !! ");
    }

    public int getSpeed() {
        return speed;
    }

}
