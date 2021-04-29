package Factory.AbstractFactory.Ingredient;

/**
 * @author TYX
 * @name CGIngredientFactory
 * @description
 * @createTime 2021/4/28 18:29
 **/
public class CGIngredientFactory implements IngredientFactory{
    @Override
    public Cheese getCheese() {
        return new CGCheese();
    }

    @Override
    public Sauce getSauce() {
        return new CGSauce();
    }
}
