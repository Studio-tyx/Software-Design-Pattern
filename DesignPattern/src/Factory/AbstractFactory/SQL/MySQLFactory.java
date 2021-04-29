package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name MySQLFactory
 * @description
 * @createTime 2021/4/28 17:03
 **/
public class MySQLFactory implements DatabaseFactory{
    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }
}
