package Command.practice_20210421;

/**
 * @author TYX
 * @name SingleOnCommand
 * @description 单个开关的打开
 * @createTime 2021/4/21 14:01
 **/
public class SingleOnCommand implements Command{
    Switch aSwitch;

    public SingleOnCommand(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void execute() {
        aSwitch.on();
    }

    @Override
    public void undo() {
        aSwitch.off();
    }
}
