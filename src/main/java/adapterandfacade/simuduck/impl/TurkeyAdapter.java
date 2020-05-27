package adapterandfacade.simuduck.impl;

import adapterandfacade.simuduck.Duck;
import adapterandfacade.simuduck.Turkey;

/**
 * 火鸡-->鸭子
 * 适配器
 *
 * @author neilz
 * @create 2020/5/27 10:23
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 火鸡无法长距离飞行
     * 为了和鸭子对应就多飞几次
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
