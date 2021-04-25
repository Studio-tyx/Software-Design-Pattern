package Strategy.homework_20210318;

/**
 * @author TYX
 * @name Strategy.homework_20210318.TextbookDiscount
 * @description
 * @time 2021/3/18 10:10
 **/
public class TextbookDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return price-1;
    }
}
