package observer.p2p.impl;

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
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                notificationService.sendInboxMessage(userId, "Welcome...");
            }
        });
        thread.start();
    }
}
