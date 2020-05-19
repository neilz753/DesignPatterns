package observer.p2p.impl;

import com.google.common.eventbus.Subscribe;
import observer.p2p.service.PromotionService;
import observer.p2p.RegObserver;

/**
 * @author neilz
 * @create 2020/5/18 14:31
 */
public class RegPromotionObserver implements RegObserver {

    // 依赖注入
    private PromotionService promotionService;

    @Override
    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
