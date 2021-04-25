package Factory.FactoryMethod;

/**
 * @author TYX
 * @name PizzaStore
 * @description
 * @createTime 2021/3/29 16:04
 **/
public abstract class PizzaStore {
    abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
