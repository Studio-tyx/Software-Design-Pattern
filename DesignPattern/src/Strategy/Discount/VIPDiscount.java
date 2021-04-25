package Strategy.Discount;

/**
 * @author TYX
 * @name VIPDiscount
 * @description
 * @createTime 2021/4/23 14:14
 **/
public class VIPDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return price*0.5;
    }
}
