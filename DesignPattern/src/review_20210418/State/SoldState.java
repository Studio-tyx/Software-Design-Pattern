package review_20210418.State;

/**
 * @author TYX
 * @name SoldState
 * @description
 * @createTime 2021/4/18 13:51
 **/
public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("虽然我很想要硬币但是蛋还没出来你等会再投币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你都扭了不退钱的哈");
    }

    @Override
    public void turnCrank() {
        System.out.println("投一个币想扭两次想桃子呢");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.noQuarterState);
        }else{
            System.out.println("卖完啦！");
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
