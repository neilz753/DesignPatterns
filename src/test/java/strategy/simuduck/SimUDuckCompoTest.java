package strategy.simuduck;

import org.junit.Test;
import strategy.simuduck.composition.CDuck;
import strategy.simuduck.composition.duck.MallardDuck;
import strategy.simuduck.composition.duck.ModelDuck;
import strategy.simuduck.composition.impl.FlyRocketPowered;

/**
 * @author neilz
 * @create 2020/5/11 20:17
 */
public class SimUDuckCompoTest {

    @Test
    public void run_mallardDuck() {
        CDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }

    /**
     * 动态设定飞行行为
     */
    @Test
    public void run_modelDuck() {
        CDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
