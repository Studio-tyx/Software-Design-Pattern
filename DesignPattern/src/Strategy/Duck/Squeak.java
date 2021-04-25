package Strategy.Duck;

/**
 * @author TYX
 * @name Squeak
 * @description
 * @createTime 2021/4/18 10:40
 **/
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak--");
    }
}
