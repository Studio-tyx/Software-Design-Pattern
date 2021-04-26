package Decorator.Coffee;

/**
 * @author TYX
 * @name DarkRoast 深烘焙
 * @description
 * @createTime 2021/4/26 19:45
 **/
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description="Dark Roast";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
