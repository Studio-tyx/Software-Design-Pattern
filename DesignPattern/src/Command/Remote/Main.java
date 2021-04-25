package Command.Remote;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/19 19:27
 **/
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl();

        Light light=new Light();
        TV tv=new TV();

        LightOnCommand lightOnCommand=new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        PartyOnCommand partyOnCommand=new PartyOnCommand(light,tv);
        PartyOffCommand partyOffCommand=new PartyOffCommand(light,tv);
        remoteControl.setCommand(1,partyOnCommand,partyOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPressed();
    }
}
