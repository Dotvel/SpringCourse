package springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
