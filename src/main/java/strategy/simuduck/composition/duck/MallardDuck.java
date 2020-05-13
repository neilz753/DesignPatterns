package strategy.simuduck.composition.duck;

import strategy.simuduck.composition.impl.FlyWithWings;
import strategy.simuduck.composition.CDuck;
import strategy.simuduck.composition.impl.Quack;

/**
 * @author neilz
 * @create 2020/5/11 20:48
 */
public class MallardDuck extends CDuck {

    /**
     * 绿头鸭 呱呱叫 会飞
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观绿头鸭");
    }

}
