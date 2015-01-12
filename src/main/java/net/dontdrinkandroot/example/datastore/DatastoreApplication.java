package net.dontdrinkandroot.example.datastore;

import org.apache.commons.configuration.XMLConfiguration;

import com.joyaether.datastore.Datastore;
import com.joyaether.datastore.servlet.BaseDatastoreApplication;

public class DatastoreApplication extends BaseDatastoreApplication {
	
	/** ARS database configuration */
	private final String CONFIG_ARS_DATABASE_URL = "ars_database.url";
	private final String CONFIG_ARS_DATABASE_USERNAME = "ars_database.username";
	private final String CONFIG_ARS_DATABASE_PASSWORD = "ars_database.password";
	
	public static final String PARAM_CONTENT_PATH = "com.bdit.datastore.content.path";
	
	/** Name of the key that specifies the URL */
	public static final String PARAM_CONTENT_URL = "com.bdit.datastore.content.url";
	
	private Datastore arsDatastore;
	
	
	
	public enum Store {
		
		// Base database type
		ARS ;
		public static Store fromInteger(int value) {
			switch(value) {
				case 1 : 
					return ARS;
				default : 
					throw new IllegalAccessError();
			}
		}
	}
	
	public Datastore getDatastore(Store store) {
		switch (store) {
		case ARS : 
			return getDatastore();
		}
		return null;
	}
	
	public synchronized Datastore getArsDatastore() {
		
		if (arsDatastore == null) {
			XMLConfiguration config = getConfiguration();
			arsDatastore = new Datastore(
					config.getString(CONFIG_ARS_DATABASE_URL),
					config.getString(CONFIG_ARS_DATABASE_USERNAME),
					config.getString(CONFIG_ARS_DATABASE_PASSWORD)); 
		}
		return arsDatastore;
	}
	public DatastoreApplication() {
		// TODO Auto-generated constructor stub
	}
	
}
