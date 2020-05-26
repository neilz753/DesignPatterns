package command.remotecontrol.furniture;

/**
 * 音响
 *
 * @author neilz
 * @create 2020/5/26 10:04
 */
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "Stereo is on !!");
    }
    public void setCD() {
        System.out.println(location + "Stereo set the CD !!");
    }
    public void setVolum(int num) {
        System.out.println(location + "Stereo Volum set "+ num +"!!");
    }
    public void off() {
        System.out.println(location + "Stereo is off !! ");
    }
}
