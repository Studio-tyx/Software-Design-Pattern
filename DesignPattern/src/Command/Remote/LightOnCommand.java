package Command.Remote;

/**
 * @author TYX
 * @name LightOnCommand
 * @description
 * @createTime 2021/4/19 19:19
 **/
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
