package Strategy.Discount;

/**
 * @author TYX
 * @name StudentTicket
 * @description
 * @createTime 2021/4/23 14:15
 **/
public class StudentTicket extends Ticket{
    public StudentTicket(double price) {
        super(price);
        discount=new StudentDiscount();
    }
}
