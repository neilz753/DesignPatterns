package strategy.simuduck.iface.duck;

import strategy.simuduck.iface.IDuck;
import strategy.simuduck.iface.Quackable;

/**
 * 橡皮鸭
 *
 * @author neilz
 * @create 2020/5/11 16:08
 */
public class RubberDuck extends IDuck implements Quackable {

    public RubberDuck(){
        super();
        quack();
    }

    @Override
    public void display() {
        System.out.println("外观橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("叫声嘎嘎叫");
    }
}
