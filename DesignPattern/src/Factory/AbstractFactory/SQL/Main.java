package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name Main
 * @description
 * @createTime 2021/4/28 17:05
 **/
public class Main {
    public static void main(String[] args) {
        DatabaseFactory mysql=new MySQLFactory();
        Connection connection=mysql.createConnection();
        connection.connect();
        Statement statement=mysql.createStatement();
        statement.execute();

        DatabaseFactory oracle=new OracleFactory();
        connection=oracle.createConnection();
        connection.connect();
        statement=oracle.createStatement();
        statement.execute();
    }
}
