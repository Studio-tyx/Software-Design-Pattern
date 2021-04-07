package lesson_20210329.FactoryMethod;

/**
 * @author TYX
 * @name CGPizzaStore
 * @description
 * @createTime 2021/3/29 16:15
 **/
public class CGPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new CGCheesePizza();
        }
        else if(item.equals("clam")){
            return new CGClamPizza();
        }
        else return null;
    }
}
