package Strategy.Discount;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/23 14:17
 **/
public class Main {
    public static void main(String[] args) {
        Ticket student=new StudentTicket(10);
        Ticket vip=new VIPTicket(10);
        System.out.println(student.getPrice());
        System.out.println(vip.getPrice());
    }
}
