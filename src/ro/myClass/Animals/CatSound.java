package ro.myClass.Animals;

public class CatSound implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("Meow meow !");
    }
}
