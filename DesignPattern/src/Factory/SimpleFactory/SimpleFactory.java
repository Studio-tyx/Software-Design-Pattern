package Factory.SimpleFactory;

/**
 * @author TYX
 * @name SimpleFactory
 * @description
 * @createTime 2021/3/29 15:57
 **/
public class SimpleFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if(type.equals("clam")){
            pizza=new ClamPizza();
        }
        return pizza;
    }
}
