package Command.practice_20210421;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name DoubleOnCommand
 * @description 总开关的打开
 * @createTime 2021/4/21 13:59
 **/
public class DoubleOnCommand implements Command{
    List<Command> commandList;

    public DoubleOnCommand(Switch switch1, Switch switch2) {
        commandList=new ArrayList<>();
        commandList.add(new SingleOnCommand(switch1));
        commandList.add(new SingleOnCommand(switch2));
    }

    @Override
    public void execute() {
        for(Command s:commandList){
            s.execute();
        }
    }

    @Override
    public void undo() {
        for(Command s:commandList){
            s.undo();
        }
    }
}
