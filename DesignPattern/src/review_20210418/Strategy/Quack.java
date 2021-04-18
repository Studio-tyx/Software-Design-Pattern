package review_20210418.Strategy;

/**
 * @author TYX
 * @name Quack
 * @description
 * @createTime 2021/4/18 10:39
 **/
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack--");
    }
}
