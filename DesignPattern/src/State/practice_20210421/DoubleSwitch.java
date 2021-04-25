package State.practice_20210421;

/**
 * @author TYX
 * @name DoubleSwitch
 * @description 总开关
 * @createTime 2021/4/21 14:24
 **/
public class DoubleSwitch {
    State now;
    State on;
    State off;

    public DoubleSwitch() {
        now=new OnState(this);
        on=new OnState(this);
        off=new OffState(this);
    }

    public void setState(State state){
        now=state;
    }

    public void switch1on(){now.switch1on();}
    public void switch2on(){now.switch2on();}
    public void switch1off(){now.switch1off();}
    public void switch2off(){now.switch2off();}
}
