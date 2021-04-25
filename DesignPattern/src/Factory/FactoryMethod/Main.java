package Factory.FactoryMethod;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/3/29 16:13
 **/
public class Main {
    public static void main(String[] args) {
        PizzaStore nyPS=new NYPizzaStore();
        nyPS.orderPizza("cheese");

        PizzaStore cgPS=new CGPizzaStore();
        cgPS.orderPizza("clam");

        /*
        一家pizza店可以选择制作多种pizza
        制作什么样的pizza与地点有关
         */
    }
}
