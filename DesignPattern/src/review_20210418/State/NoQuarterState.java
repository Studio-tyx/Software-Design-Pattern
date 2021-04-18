package review_20210418.State;

/**
 * @author TYX
 * @name NoQuarterState
 * @description
 * @createTime 2021/4/18 14:06
 **/
public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("感谢投币欢迎三连！");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没投币还退币想桃子");
    }

    @Override
    public void turnCrank() {
        System.out.println("没投币你扭啥扭");
    }

    @Override
    public void dispense() {
        System.out.println("麻烦先投币谢谢");
    }
}
