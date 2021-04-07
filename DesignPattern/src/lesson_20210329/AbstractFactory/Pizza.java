package lesson_20210329.AbstractFactory;

/**
 * @author TYX
 * @name Pizza
 * @description
 * @createTime 2021/3/29 16:25
 **/
public abstract class Pizza {
    Sauce sauce;
    Cheese cheese;
    abstract void prepare();
}
