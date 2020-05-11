package strategydesignpattern.simuduck.iface;

/**
 * @author neilz
 * @create 2020/5/11 15:02
 */
public class MallardDuck extends IDuck implements Flyable{

    public MallardDuck(){
        super();
        fly();
    }

    @Override
    public void display() {
        System.out.println("外观绿头鸭");
    }

    @Override
    public void fly() {
        System.out.println("会飞");
    }
}
