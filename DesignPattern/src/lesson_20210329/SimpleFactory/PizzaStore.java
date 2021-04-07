package lesson_20210329.SimpleFactory;

/**
 * @author TYX
 * @name PizzaStore
 * @description
 * @createTime 2021/3/29 16:01
 **/
public class PizzaStore {
    SimpleFactory factory;
    public PizzaStore(SimpleFactory factory){
        this.factory=factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
