package googleapi;
import com.google.inject.*;


public class HelloWorldModule extends AbstractModule {
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
    }
}

