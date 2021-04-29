package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name MySQLStatement
 * @description
 * @createTime 2021/4/28 16:57
 **/
public class MySQLStatement implements Statement{
    @Override
    public void execute() {
        System.out.println("MySQL Statement: executing--");
    }
}
