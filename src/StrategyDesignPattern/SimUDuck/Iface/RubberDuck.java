package strategydesignpattern.simuduck.iface;

/**
 * 橡皮鸭
 *
 * @author neilz
 * @create 2020/5/11 16:08
 */
public class RubberDuck extends IDuck implements Flyable{

    public RubberDuck(){
        super();
        fly();
    }

    @Override
    public void display() {
        System.out.println("外观橡皮鸭");
    }

    @Override
    public void fly() {
    }
}
