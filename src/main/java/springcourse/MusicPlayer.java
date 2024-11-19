package springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public MusicPlayer(){

    }

    public void setName(String name) { //<property name="name" value="Some name"/> этот сеттер используется
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) { //<property name="volume" value="50"/> здесь используется этот сеттер
        this.volume = volume;
    }

    // IoC

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public void playMusicList() {
//        for (Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }
    public void setMusic(String music) {
        this.music = music;
    }


//    public void setMusic(Music music) { //<property name="music" ref="musicBean"/> здесь этот сеттер
//        this.music = music;
//    }
}
