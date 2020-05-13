package strategy.ifelse.algo;

import strategy.ifelse.DiscountStrategy;
import strategy.ifelse.Strategy;

/**
 * @author neilz
 * @create 2020/5/13 11:10
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(String type) {
        return 0.95;
    }
}
