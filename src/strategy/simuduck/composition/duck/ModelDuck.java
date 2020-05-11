package strategy.simuduck.composition.duck;

import strategy.simuduck.composition.CDuck;
import strategy.simuduck.composition.impl.FlyNoWay;
import strategy.simuduck.composition.impl.Quack;

/**
 * @author zhangn
 * @created 2020/5/11 11:34 下午
 */
public class ModelDuck extends CDuck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("is a model duck");
    }
}
