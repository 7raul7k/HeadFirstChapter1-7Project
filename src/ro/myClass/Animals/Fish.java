package ro.myClass.Animals;

public class Fish extends Animals{
    private String name;

    String firstName;
    String lastName;
    public Fish(String firstName,String lastName) {
        this.type = Type.FISH;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public void display() {
        System.out.println("Im a fish");
    }
    @Override
    public double cost(){
        return 500;
    }




}
