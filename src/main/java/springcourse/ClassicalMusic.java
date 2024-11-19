package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //если мы не присваиваем id, то искать бин необходимо по названию класса с маленькой буквы (classicalMusic)
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>(); //создали список, который будет хранить песни

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("moonlight sonata");
        songs.add("Fly away on the wings of the wind");
        songs.add("Caprice No. 24");
    }

    @Override
    public List<String> getSong() {
        return songs; //вернули список
    }

}
