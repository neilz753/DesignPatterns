package strategy.simuduck.composition.impl;

import strategy.simuduck.composition.FlyBehavior;

/**
 * @author neilz
 * @create 2020/5/11 20:20
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞的鸭子");
    }
}
