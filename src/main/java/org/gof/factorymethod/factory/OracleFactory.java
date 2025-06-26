package org.gof.factorymethod.factory;


import org.gof.factorymethod.db.DB;
import org.gof.factorymethod.db.Oracle;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new Oracle();
	}

}
