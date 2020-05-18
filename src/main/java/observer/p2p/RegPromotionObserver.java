package observer.p2p;

/**
 * @author neilz
 * @create 2020/5/18 14:31
 */
public class RegPromotionObserver implements RegObserver{

    // 依赖注入
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
