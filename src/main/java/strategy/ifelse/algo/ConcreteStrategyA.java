package strategy.ifelse.algo;

import strategy.ifelse.Strategy;

/**
 * @author neilz
 * @create 2020/5/12 9:59
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("algorithm A");
    }
}
