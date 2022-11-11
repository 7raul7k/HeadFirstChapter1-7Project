package ro.myClass.Animals;

public class Dog extends Animals{

    String firstName;
    String lastName;

    @Override
    public void display() {
        System.out.println("I'm a Dog");
    }

    private SoundBehavior dogSound;

    public Dog(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dogSound = new DogSound();
        this.type = Type.DOG;
    }

    @Override
    public double cost(){
        return 2000;
    }


}
