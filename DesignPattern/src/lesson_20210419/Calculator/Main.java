package lesson_20210419.Calculator;

/**
 * @author TYX
 * @name Main 主函数
 * @description
 * @createTime 2021/4/21 15:01
 **/
public class Main {
    public static void main(String[] args) {
        User user=new User();

        user.compute('+',100);
        user.compute('-',50);
        user.compute('*',10);
        user.compute('/',2);

        user.undo(3);
        user.redo(2);
    }
}
