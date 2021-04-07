package lesson_20210329.AbstractFactory;

/**
 * @author TYX
 * @name CheesePizza
 * @description
 * @createTime 2021/3/29 16:26
 **/
public class CheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }
}
