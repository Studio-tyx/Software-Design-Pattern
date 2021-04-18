package review_20210418.Strategy;

/**
 * @author TYX
 * @name 火箭鸭
 * @description
 * @createTime 2021/4/18 10:45
 **/
public class 火箭鸭 extends Duck{
    public 火箭鸭() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("我是火箭鸭！");
        performFly();
        performQuack();
        System.out.println();
    }
}
