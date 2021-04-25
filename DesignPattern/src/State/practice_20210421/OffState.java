package State.practice_20210421;

/**
 * @author TYX
 * @name OffState
 * @description 关闭状态
 * @createTime 2021/4/21 14:26
 **/
public class OffState implements State{
    DoubleSwitch doubleSwitch;

    public OffState(DoubleSwitch doubleSwitch) {
        this.doubleSwitch = doubleSwitch;
    }

    @Override
    public void switch1on() {
        System.out.println("正在打开");
        doubleSwitch.setState(doubleSwitch.on);
    }

    @Override
    public void switch2on() {
        System.out.println("正在打开");
        doubleSwitch.setState(doubleSwitch.on);
    }

    @Override
    public void switch1off() {
        System.out.println("已经关上！");
    }

    @Override
    public void switch2off() {
        System.out.println("已经关上！");
    }
}
