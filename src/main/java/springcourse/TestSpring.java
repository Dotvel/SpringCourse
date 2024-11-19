package springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music); //внедряем зависимость вручную в конструкторе
        //при создании нового объекта
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstmusicPlayer == secondmusicPlayer; //переменные указывают на один и тот же объект
//        System.out.println(comparison);
//
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//
//        firstmusicPlayer.setVolume(10);
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume()); //будет значение 10, как у firstPlayer, т.к scope Singleton
//
//        firstmusicPlayer.playMusicList();

        context.close();
    }
}
