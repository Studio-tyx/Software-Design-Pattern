package Decorator.Coffee;

/**
 * @author TYX
 * @name Mocha
 * @description
 * @createTime 2021/4/26 19:47
 **/
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+".Mocha";
    }

    @Override
    public double cost() {
        return 0.20+ beverage.cost();
    }
}
