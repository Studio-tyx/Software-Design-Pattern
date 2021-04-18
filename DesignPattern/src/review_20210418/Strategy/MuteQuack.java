package review_20210418.Strategy;

/**
 * @author TYX
 * @name MuteQuack
 * @description
 * @createTime 2021/4/18 10:40
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("no voice");
    }
}
