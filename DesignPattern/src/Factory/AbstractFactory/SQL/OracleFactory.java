package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name OracleFactory
 * @description
 * @createTime 2021/4/28 17:04
 **/
public class OracleFactory implements DatabaseFactory{
    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }
}
