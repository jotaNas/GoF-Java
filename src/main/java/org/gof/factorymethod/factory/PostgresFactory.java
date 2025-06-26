package org.gof.factorymethod.factory;

import org.gof.factorymethod.db.DB;
import org.gof.factorymethod.db.PostgreSQL;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgreSQL();
	}

}
