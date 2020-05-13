package strategy.simuduck.iface;

public class IDuck {

    public IDuck(){
        swim();
        display();
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
