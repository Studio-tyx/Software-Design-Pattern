package review_20210418.State;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/18 14:09
 **/
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine=new GumballMachine(2);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
