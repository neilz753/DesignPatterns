package strategy.ifelse.factory;

import strategy.ifelse.DiscountStrategy;
import strategy.ifelse.algo.GrouponDiscountStrategy;
import strategy.ifelse.algo.NormalDiscountStrategy;
import strategy.ifelse.algo.PromotionDiscountStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author neilz
 * @create 2020/5/13 11:07
 */
public class DiscountStrategyFactory {
    private static final Map strategies = new HashMap<>();

    static {
        strategies.put("NORMAL", new NormalDiscountStrategy());
        strategies.put("GROUPON", new GrouponDiscountStrategy());
        strategies.put("PROMOTION", new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(String type) {
        return (DiscountStrategy) strategies.get(type);
    }
}
