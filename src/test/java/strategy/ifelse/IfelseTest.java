package strategy.ifelse;

import strategy.ifelse.algo.ConcreteStrategyB;
import strategy.ifelse.factory.StrategyCachedFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * @author neilz
 * @create 2020/5/12 10:24
 */
public class IfelseTest {

    /**
     * 运行时动态确定，根据配置文件的配置决定使用哪种策略
     */
    @Test
    public void run_configDecideStrategy() throws IOException {
        Strategy strategy = null;
        Properties props = new Properties();
        props.load(Object.class.getResourceAsStream("/strategy/ifelse/config.properties"));
        String type = props.getProperty("eviction_type");
        strategy = StrategyCachedFactory.getStrategy(type);

        UserCache userCache = new UserCache(strategy);
        userCache.runStrategyAlgorithm();
    }

    /**
     * 非运行时动态确定，在代码中指定使用哪种策略
     * 在这种应用场景下，策略模式实际上退化成了“面向对象的多态特性”或“基于接口而非实现编程原则”
     */
    @Test
    public void run_codeDecideStrategy() {
        Strategy strategy = new ConcreteStrategyB();
        UserCache userCache = new UserCache(strategy);
        userCache.runStrategyAlgorithm();
    }

    /**
     * orderServiceNew 虽然用了策略模式，
     * 但这种实现方式相当于把原来的 if-else 分支逻辑，从 OrderService 类中转移到了工厂类中，实际上并没有真正将它移除。
     */
    @Test
    public void run_orderService() {
        OrderService orderService = new OrderService();
        System.out.println(orderService.discount("NORMAL"));
    }

    @Test
    public void run_orderServiceNew() {
        OrderServiceNew orderServiceNew = new OrderServiceNew();
        System.out.println(orderServiceNew.discount("NORMAL"));
    }

}
