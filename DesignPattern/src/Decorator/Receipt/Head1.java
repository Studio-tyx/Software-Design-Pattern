package Decorator.Receipt;

/**
 * @author TYX
 * @name Head1
 * @description
 * @createTime 2021/4/26 20:00
 **/
public class Head1 extends Decorator{
    public Head1(Receipt receipt) {
        this.receipt = receipt;
    }

    @Override
    public String getDescription() {
        return "head1+"+receipt.getDescription();
    }
}
