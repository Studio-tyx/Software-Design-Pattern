package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name OracleStatement
 * @description
 * @createTime 2021/4/28 17:02
 **/
public class OracleStatement implements Statement{
    @Override
    public void execute() {
        System.out.println("Oracle Statement: executing--");
    }
}
