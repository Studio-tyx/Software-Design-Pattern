package Command.practice_20210421;

/*
如某系统要求两个开关对象要么都处于开的状态，要么都处于关的状态。在使用时它们的状态必须保持一致，开关可由开转换到关，也可由关转换到开。请用代码实现。
我用命令模式写的，因为觉得一个总开关控制两个子开关比较适合用命令模式。
 */
/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/21 14:09
 **/
public class Main {
    public static void main(String[] args) {
        Switch switch1=new Switch("switch1");
        Switch switch2=new Switch("switch2");

        DoubleOnCommand doubleOnCommand=new DoubleOnCommand(switch1,switch2);
        DoubleOffCommand doubleOffCommand=new DoubleOffCommand(switch1,switch2);

        doubleOnCommand.execute();//开了
        doubleOffCommand.execute();//关了

        doubleOffCommand.undo();//关的撤销->开
        doubleOnCommand.undo();//开的撤销->关
    }
}
