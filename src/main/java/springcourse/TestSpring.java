package springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicEnum.CLASSICAL_MUSIC); //при создании объекта класса musicPlayer в конструкторе Enum
        musicPlayer.playMusic(MusicEnum.ROCK_MUSIC);

        context.close();
    }
}
