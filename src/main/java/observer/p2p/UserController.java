package observer.p2p;

import observer.p2p.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 开发一个 P2P 投资理财系统，用户注册成功之后，我们会给用户发放投资体验金。
 *
 * @author neilz
 * @create 2020/5/18 10:47
 */
public class UserController {
    // 依赖注入
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    /**
     * 一次性设置好，之后也不可能动态的修改
     */
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    /**
     * 1、注册
     * 2、不仅仅只有发体验金，版本迭代后，陆续新增其他操作
     * @param telephone
     * @param password
     * @return
     */
    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }

        return userId;
    }
}
