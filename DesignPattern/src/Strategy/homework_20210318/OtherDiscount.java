package Strategy.homework_20210318;

/**
 * @author TYX
 * @name Strategy.homework_20210318.OtherDiscount
 * @description
 * @time 2021/3/18 10:13
 **/
public class OtherDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return price;
    }
}
