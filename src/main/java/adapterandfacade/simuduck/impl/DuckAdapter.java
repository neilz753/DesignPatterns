package adapterandfacade.simuduck.impl;

import adapterandfacade.simuduck.Duck;
import adapterandfacade.simuduck.Turkey;

import java.util.Random;

/**
 * 鸭子-->火鸡 适配器
 *
 * @author neilz
 * @create 2020/5/27 11:06
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    /**
     * 平均5次飞1次
     */
    @Override
    public void fly() {
        if (random.nextInt(5) == 0 ) {
            duck.fly();
        }
    }
}
