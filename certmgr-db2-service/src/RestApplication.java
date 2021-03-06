import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.test.resources.ConfigResource;

public class RestApplication extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		
		resources.add(ConfigResource.class);
		
		return resources;
	
	}

}
