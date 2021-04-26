package Decorator.Coffee;

/**
 * @author TYX
 * @name Espresso 浓缩咖啡
 * @description
 * @createTime 2021/4/26 19:44
 **/
public class Espresso extends Beverage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
