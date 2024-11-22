package springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    // Для Prototype бинов не вызывается destroy-метод!


    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
