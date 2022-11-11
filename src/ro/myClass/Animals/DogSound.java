package ro.myClass.Animals;

public class DogSound implements SoundBehavior{
    @Override
    public void sound() {
        System.out.println("Bark bark!");
    }
}
