package Adapter;

/**
 * @author TYX
 * @name WildTurkey
 * @description
 * @createTime 2021/5/1 18:38
 **/
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
