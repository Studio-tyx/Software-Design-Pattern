package Command.Calculator;

/**
 * @author TYX
 * @name CalculatorCommand
 * @description 计算器命令
 * @createTime 2021/4/21 14:43
 **/
public class CalculatorCommand extends Command{
    private char _operator;
    private int _operand;
    private Calculator _calculator;

    public CalculatorCommand(char _operator, int _operand, Calculator _calculator) {
        this._operator = _operator;
        this._operand = _operand;
        this._calculator = _calculator;
    }

    public char get_operator() {
        return _operator;
    }

    public int get_operand() {
        return _operand;
    }

    @Override
    public void execute() {
        _calculator.operation(_operator,_operand);
    }

    @Override
    public void unExecute() {
        _calculator.operation(unDo(_operator),_operand);
    }

    private char unDo(char operator){
        switch(operator) {
            case '+':return '-';
            case '-':return '+';
            case '*':return '/';
            case '/':return '*';
            default:
                System.out.println("Exception!");
                return 0;
        }
    }
}
