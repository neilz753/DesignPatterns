package strategydesignpattern.simuduck;

import strategydesignpattern.simuduck.iface.IDuck;
import strategydesignpattern.simuduck.iface.MallardDuck;
import strategydesignpattern.simuduck.iface.RedheadDuck;
import strategydesignpattern.simuduck.iface.RubberDuck;
import org.junit.Test;

/**
 * @author neilz
 * @create 2020/5/11 17:06
 */
public class SimUDuckInterfaceTest {
    @Test
    public void run_Duck(){
        new IDuck();
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
