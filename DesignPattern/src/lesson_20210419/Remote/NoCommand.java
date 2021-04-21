package lesson_20210419.Remote;

/**
 * @author TYX
 * @name NoCommand
 * @description
 * @createTime 2021/4/19 19:24
 **/
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("这是个假开关");
    }

    @Override
    public void undo() {
        System.out.println("这是个假开关");
    }
}
