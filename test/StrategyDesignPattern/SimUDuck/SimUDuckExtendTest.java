package strategydesignpattern.simuduck;

import org.junit.Test;
import strategydesignpattern.simuduck.extend.Duck;
import strategydesignpattern.simuduck.extend.MallardDuck;
import strategydesignpattern.simuduck.extend.RedheadDuck;
import strategydesignpattern.simuduck.extend.RubberDuck;

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
