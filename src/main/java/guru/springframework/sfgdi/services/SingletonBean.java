package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean(){
        System.out.println("Creating a singleton bean!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }

}
