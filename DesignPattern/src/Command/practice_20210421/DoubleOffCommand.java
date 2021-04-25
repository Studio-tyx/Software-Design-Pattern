package Command.practice_20210421;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name DoubleOffCommand
 * @description 总开关的关闭
 * @createTime 2021/4/21 14:07
 **/
public class DoubleOffCommand implements Command{
    List<Command> commandList;

    public DoubleOffCommand(Switch switch1, Switch switch2) {
        commandList=new ArrayList<>();
        commandList.add(new SingleOffCommand(switch1));
        commandList.add(new SingleOffCommand(switch2));
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
