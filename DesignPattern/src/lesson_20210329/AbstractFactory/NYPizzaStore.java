package lesson_20210329.AbstractFactory;

/**
 * @author TYX
 * @name NYPizzaStore
 * @description
 * @createTime 2021/3/29 16:28
 **/
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        Pizza pizza=null;
        IngredientFactory ingredientFactory=new NYIngredientFactory();
        if(item.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
        }
        return pizza;
    }
}
