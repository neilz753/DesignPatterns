package adapter;

import adapter.simuduck.Duck;
import adapter.simuduck.impl.MallardDuck;
import adapter.simuduck.impl.TurkeyAdapter;
import adapter.simuduck.impl.WildTurkey;
import org.junit.Test;

/**
 * @author neilz
 * @create 2020/5/27 10:32
 */
public class AdapterTest {

    @Test
    public void run_duckTestDrive() {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says ...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
