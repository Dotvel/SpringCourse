package springcourse;

import org.springframework.stereotype.Component;

@Component//если мы не присваиваем id, то искать бин необходимо по названию класса с маленькой буквы (classicalMusic)
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
