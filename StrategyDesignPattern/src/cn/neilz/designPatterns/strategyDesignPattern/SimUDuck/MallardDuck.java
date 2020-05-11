package cn.neilz.designPatterns.strategyDesignPattern.SimUDuck;

/**
 * @author neilz
 * @create 2020/5/11 15:02
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        super();
    }
    @Override
    public void display() {
        System.out.println("外观绿头鸭");
    }
}
