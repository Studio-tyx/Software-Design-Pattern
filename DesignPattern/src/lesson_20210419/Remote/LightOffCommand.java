package lesson_20210419.Remote;

/**
 * @author TYX
 * @name LightOffCommand
 * @description
 * @createTime 2021/4/19 19:21
 **/
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
