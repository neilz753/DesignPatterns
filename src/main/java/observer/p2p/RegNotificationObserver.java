package observer.p2p;

/**
 * @author neilz
 * @create 2020/5/18 14:31
 */
public class RegNotificationObserver implements RegObserver{

    // 依赖注入
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
