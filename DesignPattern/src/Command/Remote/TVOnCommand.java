package Command.Remote;

/**
 * @author TYX
 * @name TVOnCommand
 * @description
 * @createTime 2021/4/19 19:37
 **/
public class TVOnCommand implements Command{
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
