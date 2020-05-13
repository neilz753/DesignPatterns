package strategy.simuduck.iface.duck;

import strategy.simuduck.iface.IDuck;

/**
 * @author neilz
 * @create 2020/5/11 20:04
 */
public class DecoyDuck extends IDuck {
    @Override
    public void display() {
        System.out.println("外观诱饵鸭");
    }
}
