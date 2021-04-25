package Command.Calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name User
 * @description 用户界面（封装了多层回退+重做）
 * @createTime 2021/4/21 14:51
 **/
public class User {
    private Calculator _calculator=new Calculator();
    private List<Command> _commands=new ArrayList<>();
    private int _current=0;

    public void redo(int levels){
        System.out.println("\n-----redo "+levels+" levels");
        for(int i=0;i<levels;i++){
            if(_current<_commands.size()-1){
                Command command=_commands.get(_current-1);
                _current++;
                command.execute();
            }
        }
    }

    public void undo(int levels){
        System.out.println("\n-----undo "+levels+" levels");
        for(int i=0;i<levels;i++){
            if(_current>0){
                Command command=_commands.get(_current-1);
                _current--;
                command.unExecute();
            }
        }
    }

    public void compute(char operator,int operand){
        Command command=new CalculatorCommand(operator,operand,_calculator);
        command.execute();
        _commands.add(command);
        _current++;
    }
}
