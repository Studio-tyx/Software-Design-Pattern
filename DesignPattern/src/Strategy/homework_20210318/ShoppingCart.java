package Strategy.homework_20210318;

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
