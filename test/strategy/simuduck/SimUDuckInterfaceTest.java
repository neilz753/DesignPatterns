package strategy.simuduck;

import strategy.simuduck.iface.*;
import org.junit.Test;
import strategy.simuduck.iface.duck.DecoyDuck;
import strategy.simuduck.iface.duck.MallardDuck;
import strategy.simuduck.iface.duck.RedheadDuck;
import strategy.simuduck.iface.duck.RubberDuck;

/**
 * @author neilz
 * @create 2020/5/11 17:06
 */
public class SimUDuckInterfaceTest {
    @Test
    public void run_IDuck(){
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

    @Test
    public void run_decoyDuck(){
        new DecoyDuck();
    }

}
