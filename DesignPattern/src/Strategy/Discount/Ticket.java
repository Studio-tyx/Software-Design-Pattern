package Strategy.Discount;

/**
 * @author TYX
 * @name Ticket
 * @description
 * @createTime 2021/4/23 14:14
 **/
public class Ticket {
    double price;
    Discount discount;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice(){return discount.getDiscount(price);}
}
