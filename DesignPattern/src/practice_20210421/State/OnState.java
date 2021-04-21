package practice_20210421.State;

/**
 * @author TYX
 * @name OnState
 * @description 打开状态
 * @createTime 2021/4/21 14:23
 **/
public class OnState implements State{
    DoubleSwitch doubleSwitch;

    public OnState(DoubleSwitch doubleSwitch) {
        this.doubleSwitch = doubleSwitch;
    }

    @Override
    public void switch1on() {
        System.out.println("已经打开！");
    }

    @Override
    public void switch2on() {
        System.out.println("已经打开！");
    }

    @Override
    public void switch1off() {
        System.out.println("正在关闭");
        doubleSwitch.setState(doubleSwitch.off);
    }

    @Override
    public void switch2off() {
        System.out.println("正在关闭");
        doubleSwitch.setState(doubleSwitch.off);
    }
}
