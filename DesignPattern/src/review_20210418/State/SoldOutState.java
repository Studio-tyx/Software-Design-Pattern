package review_20210418.State;

/**
 * @author TYX
 * @name SoldOutState
 * @description
 * @createTime 2021/4/18 14:04
 **/
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("没蛋了你还投币干啥");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没蛋了退币也没用啊");
    }

    @Override
    public void turnCrank() {
        System.out.println("我没蛋了你扭也没用啊");
    }

    @Override
    public void dispense() {
        System.out.println("没蛋了没蛋了！");
    }
}
