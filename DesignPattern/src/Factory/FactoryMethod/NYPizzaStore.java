package Factory.FactoryMethod;

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
