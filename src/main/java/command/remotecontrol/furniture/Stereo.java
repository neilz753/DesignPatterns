package command.remotecontrol.furniture;

/**
 * 音响
 *
 * @author neilz
 * @create 2020/5/26 10:04
 */
public class Stereo {

    private String tag;

    public Stereo(String tag) {
        this.tag = tag;
    }

    public void on() {
        System.out.println(tag + "Stereo is on !!");
    }
    public void setCD() {
        System.out.println(tag + "Stereo set the CD !!");
    }
    public void setVolum(int num) {
        System.out.println(tag + "Stereo Volum set "+ num +"!!");
    }
    public void off() {
        System.out.println(tag + "Stereo is off !! ");
    }
}
