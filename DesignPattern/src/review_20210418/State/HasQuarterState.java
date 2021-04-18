package review_20210418.State;

/**
 * @author TYX
 * @name HasQuarterState
 * @description
 * @createTime 2021/4/18 14:02
 **/
public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("知道老板钱多但是第二个币不急哈咱们等会再投");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("还给你还给你哼");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("扭一扭呀~");
        gumballMachine.setState(gumballMachine.soldState);
    }

    @Override
    public void dispense() {
        System.out.println("要么扭要么退币别整幺蛾子");
    }
}
