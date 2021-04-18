package review_20210418.State;

/**
 * @author TYX
 * @name GumballMachine
 * @description
 * @createTime 2021/4/18 13:52
 **/
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state=soldOutState;
    int count=0;
    public GumballMachine(int numberGumballs) {
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldState=new SoldState(this);
        this.count=numberGumballs;
        if(numberGumballs>0)state=noQuarterState;
    }
    public void insertQuarter(){state.insertQuarter();}
    public void ejectQuarter(){state.ejectQuarter();}
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("您要的蛋");
        if(count!=0)count--;
    }

    public int getCount() {
        return count;
    }
}
