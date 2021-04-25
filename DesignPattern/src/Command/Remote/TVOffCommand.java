package Command.Remote;

/**
 * @author TYX
 * @name TVOffCommand
 * @description
 * @createTime 2021/4/19 19:37
 **/
public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
