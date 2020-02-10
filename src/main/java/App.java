import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class App extends Application {

    private Set<Class<?>> classes;


    public App(){
        classes = new HashSet<Class<?>>();

        classes.add(HelloWebService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
