package observer.p2p;

/**
 * 开发一个 P2P 投资理财系统，用户注册成功之后，我们会给用户发放投资体验金。
 *
 * @author neilz
 * @create 2020/5/18 10:47
 */
public class UserController {
    // 依赖注入
    private UserService userService;
    private PromotionService promotionService;

    /**
     * 1、注册
     * 2、发放体验金
     * @param telephone
     * @param password
     * @return
     */
    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
