package strategydesignpattern.simuduck.iface;

/**
 * @author neilz
 * @create 2020/5/11 15:17
 */
public class RedheadDuck extends IDuck implements Flyable{

    public RedheadDuck(){
        super();
        fly();
    }

    @Override
    public void display() {
        System.out.println("外观红头鸭");
    }

    @Override
    public void fly() {
        System.out.println("会飞");
    }
}
