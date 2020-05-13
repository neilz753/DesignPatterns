package strategy.ifelse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neilz
 * @create 2020/5/12 10:37
 */
public class UserCache {
    private Map cacheData = new HashMap<>();
    private Strategy strategy;

    public UserCache(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runStrategyAlgorithm() {
        strategy.algorithmInterface();
    }

}
