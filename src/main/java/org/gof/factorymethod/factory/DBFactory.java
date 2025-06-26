package org.gof.factorymethod.factory;

import org.gof.factorymethod.db.DB;

public interface DBFactory {
    DB getDatabase();
}

