package strategy.ifelse;

/**
 * @author neilz
 * @create 2020/5/12 11:28
 */
public class OrderService {
    public double discount(String type) {
        double discount = 0.0;
        if (type.equals("NORMAL")) {
            // 普通订单
            discount = 0.95;
        } else if (type.equals("GROUPON")) {
            // 团购订单
            discount = 0.85;
        } else if (type.equals("PROMOTION")) {
            // 促销订单
            discount = 0.75;
        }
        return discount;
    }
}
