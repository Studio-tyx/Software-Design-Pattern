package lesson_20210329.FactoryMethod;

import lesson_20210329.SimpleFactory.CheesePizza;
import lesson_20210329.SimpleFactory.ClamPizza;

/**
 * @author TYX
 * @name NYPizzaStore
 * @description
 * @createTime 2021/3/29 16:06
 **/
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYCheesePizza();
        }
        else if(item.equals("clam")){
            return new NYClamPizza();
        }
        else return null;
    }
}
