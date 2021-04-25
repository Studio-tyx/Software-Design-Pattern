package Factory.AbstractFactory;

/**
 * @author TYX
 * @name NYIngredientFactory
 * @description
 * @createTime 2021/3/29 16:21
 **/
public class NYIngredientFactory implements IngredientFactory{
    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new CheeseA();
    }
}
