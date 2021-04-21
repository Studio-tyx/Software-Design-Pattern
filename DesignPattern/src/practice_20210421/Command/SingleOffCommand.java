package practice_20210421.Command;

/**
 * @author TYX
 * @name SingleOffCommand
 * @description 单个开关的关闭
 * @createTime 2021/4/21 14:06
 **/
public class SingleOffCommand implements Command{
    Switch aSwitch;

    public SingleOffCommand(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void execute() {
        aSwitch.off();
    }

    @Override
    public void undo() {
        aSwitch.on();
    }
}
