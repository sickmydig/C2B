package net.dontdrinkandroot.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import com.joyaether.datastore.servlet.ApplicationServletContextListener;

public class ARSApplicationServletContextListener extends ApplicationServletContextListener {
	final String ROOT_PATH = "webapp.base";
	
	/** A configuration setting that specifies the location to store content in the app. */
	public static final String CONFIG_CONTENT_PATH = "com.bdit.datastore.content.path";
	
	/** The configuration parameter that specifies the root URL of the contents uploaded to the server. */
	public static final String CONFIG_ROOT_URL = "com.bdit.datastore.root.url";
	
	@Override
	public void contextInitialized(ServletContextEvent evt) {
		super.contextInitialized(evt);
		
		ServletContext ctx = evt.getServletContext();
		String param = ctx.getInitParameter(CONFIG_CONTENT_PATH);
		if (param != null) {			
			System.setProperty(ROOT_PATH, param);
		}
	}
}
