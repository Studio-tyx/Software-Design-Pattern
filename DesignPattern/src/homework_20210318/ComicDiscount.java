package homework_20210318;

/**
 * @author TYX
 * @name homework_20210318.ComicDiscount
 * @description
 * @time 2021/3/18 10:10
 **/
public class ComicDiscount implements Discount{
    @Override
    public double getDiscount(double price) {
        return 0.93*price;
    }
}
