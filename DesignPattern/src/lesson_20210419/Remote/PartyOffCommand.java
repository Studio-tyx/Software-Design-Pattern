package lesson_20210419.Remote;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name PartyOffCommand
 * @description
 * @createTime 2021/4/19 19:42
 **/
public class PartyOffCommand implements Command{
    List<Command> commands;

    public PartyOffCommand(Light light,TV tv) {
        commands=new ArrayList<>();
        commands.add(new LightOffCommand(light));
        commands.add(new TVOffCommand(tv));
    }

    @Override
    public void execute() {
        for(Command c:commands){
            c.execute();
        }
    }

    @Override
    public void undo() {
        for(Command c:commands){
            c.undo();
        }
    }
}
