package Factory.AbstractFactory;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/3/29 16:48
 **/
public class Main {
    public static void main(String[] args) {
        PizzaStore nyPS=new NYPizzaStore();
        nyPS.createPizza("cheese");
        /*
        一家pizza店可以选择做多种pizza 也可以选择多家工厂之一
        pizza怎么做和工厂有关（工厂与原料有一对一关系）
         */
    }
}
