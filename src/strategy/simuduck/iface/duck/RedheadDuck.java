package strategy.simuduck.iface.duck;

import strategy.simuduck.iface.Flyable;
import strategy.simuduck.iface.IDuck;
import strategy.simuduck.iface.Quackable;

/**
 * @author neilz
 * @create 2020/5/11 15:17
 */
public class RedheadDuck extends IDuck implements Flyable, Quackable {

    public RedheadDuck(){
        super();
        quack();
        fly();
    }

    @Override
    public void display() {
        System.out.println("外观红头鸭");
    }

    @Override
    public void quack() {
        System.out.println("叫声嘎嘎叫");
    }

    @Override
    public void fly() {
        System.out.println("会飞");
    }
}
