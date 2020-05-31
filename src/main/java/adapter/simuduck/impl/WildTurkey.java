package adapter.simuduck.impl;

import adapter.simuduck.Turkey;

/**
 * @author zhangn
 * @created 2020/5/26 10:45 下午
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
