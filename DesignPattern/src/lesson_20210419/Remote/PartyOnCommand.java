package lesson_20210419.Remote;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name PartyOnCommand
 * @description
 * @createTime 2021/4/19 19:38
 **/
public class PartyOnCommand implements Command{
    List<Command> commands;

    public PartyOnCommand(Light light,TV tv) {
        commands=new ArrayList<>();
        commands.add(new LightOnCommand(light));
        commands.add(new TVOnCommand(tv));
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
