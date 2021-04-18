package review_20210418.Strategy;

/**
 * @author TYX
 * @name FlyNoWay
 * @description
 * @createTime 2021/4/18 10:38
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
