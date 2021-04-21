package practice_20210421.State;

/*
如某系统要求两个开关对象要么都处于开的状态，要么都处于关的状态。在使用时它们的状态必须保持一致，开关可由开转换到关，也可由关转换到开。请用代码实现。
同学说用状态模式然后我也写了一下emmmm但是我还是倾向于用命令模式
 */
/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/21 14:29
 **/
public class Main {
    public static void main(String[] args) {
        DoubleSwitch doubleSwitch=new DoubleSwitch();
        doubleSwitch.switch1on();
        doubleSwitch.switch2on();
        doubleSwitch.switch2off();
        doubleSwitch.switch1off();
    }
}
