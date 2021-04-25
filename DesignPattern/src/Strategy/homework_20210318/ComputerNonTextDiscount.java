package Strategy.homework_20210318;

/**
 * @author TYX
 * @name Strategy.homework_20210318.ComputerNonTextDiscount
 * @description
 * @time 2021/3/18 10:12
 **/
public class ComputerNonTextDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return 0.97*price;
    }
}
