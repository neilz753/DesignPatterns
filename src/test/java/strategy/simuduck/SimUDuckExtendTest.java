package strategy.simuduck;

import org.junit.Test;
import strategy.simuduck.extend.Duck;
import strategy.simuduck.extend.duck.MallardDuck;
import strategy.simuduck.extend.duck.RedheadDuck;
import strategy.simuduck.extend.duck.RubberDuck;

/**
 * @author neilz
 * @create 2020/5/11 15:29
 */
public class SimUDuckExtendTest {

    @Test
    public void run_Duck(){
        new Duck();
    }

    @Test
    public void run_mallardDuck(){
        new MallardDuck();
    }

    @Test
    public void run_redheadDuck(){
        new RedheadDuck();
    }

    @Test
    public void run_rubberDuck(){
        new RubberDuck();
    }

}
