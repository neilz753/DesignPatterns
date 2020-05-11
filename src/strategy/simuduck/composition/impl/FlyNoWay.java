package strategy.simuduck.composition.impl;

import strategy.simuduck.composition.FlyBehavior;

/**
 * @author neilz
 * @create 2020/5/11 20:39
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞的鸭子");
    }
}
