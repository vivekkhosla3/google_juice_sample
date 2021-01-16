package googleapi;

import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.inject.Inject;

public class HelloWorldServiceMy {

    @Inject
    private HelloWorldService service;//hello service

    public static void main(String[] args) {

        HelloWorldServiceMy main = new HelloWorldServiceMy();
        //Module module = new HelloWorldModule();
        Injector injector = Guice.createInjector(new HelloWorldModule());
        injector.injectMembers(main);//injects the implementation of the service

        main.testGuice();
    }

    public void testGuice()
    {
        service.sayHello();//usage of the service
    }
}
