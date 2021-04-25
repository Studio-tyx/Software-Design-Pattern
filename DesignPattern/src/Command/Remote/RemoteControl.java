package Command.Remote;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name RemoteControl
 * @description
 * @createTime 2021/4/19 19:22
 **/
public class RemoteControl {
    List<Command> onCommands=new ArrayList<>();
    List<Command> offCommands=new ArrayList<>();
    Command undoCommand;

    public RemoteControl() {
        undoCommand=new NoCommand();
        for(int i=0;i<2;i++){
            onCommands.add(undoCommand);
            offCommands.add(undoCommand);
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands.set(slot,onCommand);
        offCommands.set(slot,offCommand);
    }

    public void onButtonWasPushed(int slot){
        onCommands.get(slot).execute();
        undoCommand=onCommands.get(slot);
    }

    public void offButtonWasPushed(int slot){
        offCommands.get(slot).execute();
        undoCommand=offCommands.get(slot);
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }
}
