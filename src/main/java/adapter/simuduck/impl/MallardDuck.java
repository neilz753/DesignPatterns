package adapter.simuduck.impl;

import adapter.simuduck.Duck;

/**
 * 绿头鸭
 * @author zhangn
 * @created 2020/5/26 10:40 下午
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
