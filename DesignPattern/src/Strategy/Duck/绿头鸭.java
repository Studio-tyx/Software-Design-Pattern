package Strategy.Duck;

/**
 * @author TYX
 * @name 绿头鸭
 * @description
 * @createTime 2021/4/18 10:44
 **/
public class 绿头鸭 extends Duck{
    public 绿头鸭() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("我是绿头鸭！");
        performFly();
        performQuack();
        System.out.println();
    }
}
