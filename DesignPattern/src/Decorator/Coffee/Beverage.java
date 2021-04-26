package Decorator.Coffee;

/**
 * @author TYX
 * @name Beverage
 * @description
 * @createTime 2021/4/26 19:41
 **/
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
