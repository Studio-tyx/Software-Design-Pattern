package Decorator.Coffee;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/26 19:48
 **/
public class Main {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());
    }
}
