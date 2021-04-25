package Strategy.Duck;

/**
 * @author TYX
 * @name FlyWithWings
 * @description
 * @createTime 2021/4/18 10:37
 **/
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
