package net.bdit.security;

import net.dontdrinkandroot.example.datastore.DatastoreApplication;

public class MyThread implements Runnable {
	private DatastoreApplication datastore;
	
	public void run() {
		this.datastore.getDatastore();
	}
}
