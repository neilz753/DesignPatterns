package strategy.simuduck.composition.impl;

import strategy.simuduck.composition.QuackBehavior;

/**
 * @author neilz
 * @create 2020/5/11 20:40
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}
