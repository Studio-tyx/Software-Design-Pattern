package Factory.AbstractFactory.Ingredient;

/**
 * @author TYX
 * @name NYIngredientFactory
 * @description
 * @createTime 2021/4/28 18:27
 **/
public class NYIngredientFactory implements IngredientFactory{
    @Override
    public Cheese getCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce getSauce() {
        return new NYSauce();
    }
}
