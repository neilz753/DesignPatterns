package strategy.ifelse.factory;

import strategy.ifelse.Strategy;
import strategy.ifelse.algo.ConcreteStrategyA;
import strategy.ifelse.algo.ConcreteStrategyB;

/**
 * 每次获取新创建的策略对象
 *
 * @author neilz
 * @create 2020/5/12 10:15
 */
public class StrategyNoCachedFactory {
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
