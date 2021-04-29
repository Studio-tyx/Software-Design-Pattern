package Factory.AbstractFactory.Ingredient;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/28 18:30
 **/
public class Main {
    public static void main(String[] args) {
        IngredientFactory ny=new NYIngredientFactory();
        CheesePizza cheese=new CheesePizza(ny);
        cheese.prepare();

        IngredientFactory cg=new CGIngredientFactory();
        cheese.setFactory(cg);
        cheese.prepare();
    }
}
