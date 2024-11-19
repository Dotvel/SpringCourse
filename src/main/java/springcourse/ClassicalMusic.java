package springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization"); //данный метод не должен содержать аргументы
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction"); //данный метод не должен принимать на вход какие либо аргументы "()"
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
