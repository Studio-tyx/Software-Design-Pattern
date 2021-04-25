package Command.Calculator;

/**
 * @author TYX
 * @name Command
 * @description 命令抽象类（其实我觉得写成接口也问题不大 但是不知道为什么ppt给的是抽象类摊手）
 * @createTime 2021/4/21 14:42
 **/
public abstract class Command {
    abstract void execute();
    abstract void unExecute();
}
