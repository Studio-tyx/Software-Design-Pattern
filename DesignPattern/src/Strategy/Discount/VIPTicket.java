package Strategy.Discount;

/**
 * @author TYX
 * @name VIPTicket
 * @description
 * @createTime 2021/4/23 14:16
 **/
public class VIPTicket extends Ticket{
    public VIPTicket(double price) {
        super(price);
        discount=new VIPDiscount();
    }
}
