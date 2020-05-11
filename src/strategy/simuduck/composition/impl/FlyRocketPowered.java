package strategy.simuduck.composition.impl;

import strategy.simuduck.composition.FlyBehavior;

/**
 * @author zhangn
 * @created 2020/5/11 11:37 下午
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
