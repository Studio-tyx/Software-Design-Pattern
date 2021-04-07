package lesson_20210329.AbstractFactory;

/**
 * @author TYX
 * @name PizzaStore
 * @description
 * @createTime 2021/3/29 16:29
 **/
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);
}
