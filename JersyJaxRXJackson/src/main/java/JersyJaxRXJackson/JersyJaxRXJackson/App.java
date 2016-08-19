package JersyJaxRXJackson.JersyJaxRXJackson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("http://jsonplaceholder.typicode.com").path("posts").path("1");
    	System.out.println(target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class));*/
    	final Client client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    	WebTarget target = client.target("http://jsonplaceholder.typicode.com").path("posts").path("1");
    	//WebTarget target = client.target("http://jsonplaceholder.typicode.com").path("posts");
    	JSONmodel json = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(JSONmodel.class);
    	System.out.println(json);
    }
}
