package strategy.simuduck.composition.impl;

import strategy.simuduck.composition.QuackBehavior;

/**
 * @author neilz
 * @create 2020/5/11 20:42
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭吱吱叫");
    }
}
