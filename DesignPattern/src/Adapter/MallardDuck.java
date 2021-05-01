package Adapter;

/**
 * @author TYX
 * @name MallardDuck
 * @description
 * @createTime 2021/5/1 18:38
 **/
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
