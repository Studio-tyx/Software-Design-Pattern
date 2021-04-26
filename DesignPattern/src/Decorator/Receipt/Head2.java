package Decorator.Receipt;

/**
 * @author TYX
 * @name Head2
 * @description
 * @createTime 2021/4/26 20:01
 **/
public class Head2 extends Decorator{
    public Head2(Receipt receipt) {
        this.receipt = receipt;
    }

    @Override
    public String getDescription() {
        return "head2+"+receipt.getDescription();
    }
}
