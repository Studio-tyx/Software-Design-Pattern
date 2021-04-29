package Factory.AbstractFactory.SQL;

public interface DatabaseFactory {
    Statement createStatement();
    Connection createConnection();
}
