package strategy.ifelse;

import strategy.ifelse.factory.DiscountStrategyFactory;

/**
 * @author neilz
 * @create 2020/5/13 11:08
 */
public class OrderServiceNew {
    public double discount(String type) {
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(type);
    }
}
