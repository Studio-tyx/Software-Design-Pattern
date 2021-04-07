package lesson_20210329.AbstractFactory;

/**
 * @author TYX
 * @name CGIngredientFactory
 * @description
 * @createTime 2021/3/29 16:24
 **/
public class CGIngredientFactory implements IngredientFactory {
    @Override
    public Sauce createSauce() {
        return new SpicySauce();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseB();
    }
}
