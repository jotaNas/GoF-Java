package org.gof.factorymethod.db;

public class PostgreSQL implements DB {
    public void query(String sql) {
        System.out.println("Executing query on PostgreSQL: " + sql);
    }

    public void update(String sql) {
        System.out.println("Executing update on PostgreSQL: " + sql);
    }
}

