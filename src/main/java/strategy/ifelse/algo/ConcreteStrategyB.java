package strategy.ifelse.algo;

import strategy.ifelse.Strategy;

/**
 * @author neilz
 * @create 2020/5/12 10:01
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("algorithm B");
    }
}
