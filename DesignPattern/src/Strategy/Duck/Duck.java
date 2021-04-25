package Strategy.Duck;

/**
 * @author TYX
 * @name Duck
 * @description
 * @createTime 2021/4/18 10:36
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    abstract void display();
}
