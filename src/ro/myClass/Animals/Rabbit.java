package ro.myClass.Animals;

public class Rabbit extends Animals {
    String firstName;
    String lastName;

    public Rabbit(String firstName,String lastName) {
        this.type = Type.RABBIT;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Override
    public void display() {
        System.out.println("Im a rabbit ");
    }
    @Override
    public double cost(){
        return 1000;
    }


}
