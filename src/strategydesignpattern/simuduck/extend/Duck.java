package strategydesignpattern.simuduck.extend;

/**
 * 鸭子行为父类
 *
 * @author neilz
 * @create 2020/5/11 14:56
 */
public class Duck {

    public Duck(){
        quack();
        swim();
        display();
        fly();
    }

    /**
     * 鸭子叫声
     */
    public void quack(){
        System.out.println("默认嘎嘎叫");
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

    /**
     * 是否会飞
     */
    public void fly(){
        System.out.println("默认会飞");
    }

}
