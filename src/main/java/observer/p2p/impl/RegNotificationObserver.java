package observer.p2p.impl;

import com.google.common.eventbus.Subscribe;
import observer.p2p.service.NotificationService;
import observer.p2p.RegObserver;

/**
 * @author neilz
 * @create 2020/5/18 14:31
 */
public class RegNotificationObserver implements RegObserver {

    // 依赖注入
    private NotificationService notificationService;

    @Override
    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
