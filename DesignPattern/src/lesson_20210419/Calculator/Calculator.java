package lesson_20210419.Calculator;

/**
 * @author TYX
 * @name Calculator
 * @description 计算器主体函数
 * @createTime 2021/4/21 14:44
 **/
public class Calculator {
    private int _curr=0;
    public void operation(char operator,int operand){
        int former=_curr;
        switch(operator){
            case '+':_curr+=operand;break;
            case '-':_curr-=operand;break;
            case '*':_curr*=operand;break;
            case '/':_curr/=operand;break;
        }
        System.out.println("current value="+former+","+_curr+",following:"+operator+operand+"");
    }
}
