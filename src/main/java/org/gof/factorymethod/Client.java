package org.gof.factorymethod;

import org.gof.factorymethod.db.DB;
import org.gof.factorymethod.factory.DBFactory;
import org.gof.factorymethod.factory.OracleFactory;
import org.gof.factorymethod.factory.PostgresFactory;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {
        DBFactory factoryOracle = new OracleFactory();
        DBFactory factoryPostgres = new PostgresFactory();

        DB db = factoryOracle.getDatabase();

        db.query("SELECT * FROM users");
        db.update("INSERT INTO users (name, age) VALUES ('User', 25)");
    }
}
