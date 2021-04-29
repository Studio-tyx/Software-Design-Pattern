package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name OracleConnection
 * @description
 * @createTime 2021/4/28 17:02
 **/
public class OracleConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Oracle Connection: connecting--");
    }
}
