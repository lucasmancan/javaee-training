import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWebService {

    @GET
    @Produces("application/json")
    public Cliente getMessage(){
        return new Cliente("Lucas");
    }
}
