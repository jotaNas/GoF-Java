package org.gof.factorymethod.db;

public class Oracle implements DB {
    public void query(String sql) {
        System.out.println("Executing query on Oracle: " + sql);
    }

    public void update(String sql) {
        System.out.println("Executing update on Oracle: " + sql);
    }
}

