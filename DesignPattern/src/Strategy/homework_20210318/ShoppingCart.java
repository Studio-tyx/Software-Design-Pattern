package Strategy.homework_20210318;

/*
一个贩卖各类书籍的电子商务网站的购物车(Shopping cart)系统计算本次购物金额的方法，比如：
对所有的教材类图书实行每本1元的折扣．
对连环画类图书提供每本7％的促销折扣
对非教材类的计算机图书有3％的折扣
对其余的图书没有折扣
请用策略模式给出设计方案，画出类图，写出关键代码。
 */
/**
 * @author TYX
 * @name Strategy.homework_20210318.ShoppingCart
 * @description
 * @time 2021/3/18 10:13
 **/
public class ShoppingCart {
    private double price;
    private Discount discount;

    public ShoppingCart(double v, Discount d) {
        price=v;
        discount=d;
    }

    public double calculate() {
        return discount.getDiscount(price);
    }
    public static void main(String[] args) {
        ShoppingCart[] sc=new ShoppingCart[3];
        sc[0]=new ShoppingCart(10.0,new TextbookDiscount());
        sc[1]=new ShoppingCart(20.0,new ComicDiscount());
        sc[2]=new ShoppingCart(21.0,new ComputerNonTextDiscount());
        double sum=0.0;
        for(ShoppingCart shoppingCart:sc){
            sum+=shoppingCart.calculate();
        }
        System.out.println(sum);
    }

}
