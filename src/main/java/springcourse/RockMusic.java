package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>(); //создали список, который будет хранить песни

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        this.songs.add("Come as you are");
        this.songs.add("The kids alert all right");
        this.songs.add("Shut your moth");
    }

    @Override
    public List<String> getSong() {
        return songs; //вернули список
    }
}
