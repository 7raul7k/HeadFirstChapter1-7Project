package ro.myClass.Animals;

public class Cat extends Animals {
    @Override
    public void display() {
        System.out.println("I'm a cat");
    }

    private SoundBehavior catSound;

    public Cat(){

        this.catSound = new CatSound();
        this.type = Type.CAT;
        catSound.sound();
    }


    @Override
    public void sound(){
        catSound.sound();
    }

    @Override
    public double cost(){
        return 2500;
    }

}
