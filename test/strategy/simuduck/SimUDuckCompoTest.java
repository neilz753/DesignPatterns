package strategy.simuduck;

import org.junit.Test;
import strategy.simuduck.composition.CDuck;
import strategy.simuduck.composition.duck.MallardDuck;

/**
 * @author neilz
 * @create 2020/5/11 20:17
 */
public class SimUDuckCompoTest {

    @Test
    public void run_miniDuckSimulator() {
        CDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
