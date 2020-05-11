package cn.neilz.designPatterns.strategyDesignPattern;

import cn.neilz.designPatterns.strategyDesignPattern.SimUDuck.Duck;
import cn.neilz.designPatterns.strategyDesignPattern.SimUDuck.MallardDuck;
import cn.neilz.designPatterns.strategyDesignPattern.SimUDuck.RedheadDuck;
import cn.neilz.designPatterns.strategyDesignPattern.SimUDuck.RubberDuck;
import org.junit.Test;

/**
 * @author neilz
 * @create 2020/5/11 15:29
 */
public class SimUDuckTest {

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
