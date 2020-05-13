package strategy.ifelse.factory;

import strategy.ifelse.Strategy;
import strategy.ifelse.algo.ConcreteStrategyA;
import strategy.ifelse.algo.ConcreteStrategyB;

import java.util.HashMap;
import java.util.Map;

/**
 *  不包含成员变量的 无状态的 策略类
 *  可共享使用的策略对象
 *  事先创建好策略对象，缓存到工厂类
 * @author neilz
 * @create 2020/5/12 10:02
 */
public class StrategyCachedFactory {
    private static final Map strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return (Strategy) strategies.get(type);
    }
}
