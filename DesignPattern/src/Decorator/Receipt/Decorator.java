package Decorator.Receipt;

/**
 * @author TYX
 * @name Decorator
 * @description
 * @createTime 2021/4/26 20:08
 **/
public abstract class Decorator extends Receipt{
    Receipt receipt;
    public abstract String getDescription();
}
