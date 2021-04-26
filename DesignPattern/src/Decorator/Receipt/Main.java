package Decorator.Receipt;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/26 20:01
 **/
public class Main {
    public static void main(String[] args) {
        Receipt receipt=new Content();
        receipt=new Head1(receipt);
        receipt=new Head2(receipt);
        System.out.println(receipt.getDescription());
    }
}
