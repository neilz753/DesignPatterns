package observer.diyeventbus;

import java.util.concurrent.Executor;

/**
 * 异步非阻塞观察者模式
 *
 * @author neilz
 * @create 2020/5/19 11:15
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
