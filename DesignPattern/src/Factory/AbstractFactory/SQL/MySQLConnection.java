package Factory.AbstractFactory.SQL;

/**
 * @author TYX
 * @name MySQLConnection
 * @description
 * @createTime 2021/4/28 16:58
 **/
public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("MySQL Connection: connecting--");
    }
}
