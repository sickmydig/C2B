package net.dontdrinkandroot.example.angularrestspringsecurity.rest.resources;

import com.joyaether.datastore.resource.ReadonlyDataObjectServerResource;

import net.dontdrinkandroot.example.angularrestspringsecurity.entity.News;

/**
 * Created by HIP on 24/12/2014.
 */
public class NewsServerResource extends ReadonlyDataObjectServerResource<News, Long> {

   @Override
protected Long getId() {
	// TODO Auto-generated method stub
	return null;
}

   @Override
	protected Class<News> getResourceType() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
