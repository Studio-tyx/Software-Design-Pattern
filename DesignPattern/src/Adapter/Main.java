package Adapter;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/5/1 18:40
 **/
public class Main {
    public static void main(String[] args) {
        Duck realDuck=new MallardDuck();
        realDuck.quack();
        realDuck.fly();

        Turkey turkey=new WildTurkey();
        Duck falseDuck=new TurkeyAdapter(turkey);
        falseDuck.quack();
        falseDuck.fly();
    }
}
