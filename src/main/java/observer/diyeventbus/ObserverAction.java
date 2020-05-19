package observer.diyeventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ObserverAction 类用来表示 @Subscribe 注解的方法，
 * 其中，target 表示观察者类，method 表示方法。
 * 它主要用在 ObserverRegistry 观察者注册表中。
 * @author neilz
 * @create 2020/5/19 10:27
 */
public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    // event是method方法的参数
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
