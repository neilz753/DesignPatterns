package strategy.simuduck.composition;

/**
 * @author neilz
 * @create 2020/5/11 20:15
 */
public class CDuck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public CDuck(){
        performQuack();
        performFly();
        swim();
        display();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 是否游泳
     */
    public void swim(){
        System.out.println("默认会游泳");
    }

    /**
     * 外观
     */
    public void display(){
        System.out.println("默认小黄鸭");
    }

}
