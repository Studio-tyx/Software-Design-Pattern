package Strategy.Discount;

/**
 * @author TYX
 * @name StudentDiscount
 * @description
 * @createTime 2021/4/23 14:13
 **/
public class StudentDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return price*0.8;
    }
}
