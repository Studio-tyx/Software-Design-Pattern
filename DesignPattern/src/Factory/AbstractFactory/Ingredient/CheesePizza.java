package Factory.AbstractFactory.Ingredient;

/**
 * @author TYX
 * @name CheesePizza
 * @description
 * @createTime 2021/4/28 18:26
 **/
public class CheesePizza extends Pizza{
    IngredientFactory factory;

    public CheesePizza(IngredientFactory factory) {
        this.factory = factory;
    }

    public void setFactory(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        cheese=factory.getCheese();
        sauce=factory.getSauce();
    }
}
