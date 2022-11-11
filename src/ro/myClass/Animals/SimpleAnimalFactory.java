package ro.myClass.Animals;

public class SimpleAnimalFactory {

    String type;



   public Animals createAnimal(String type,String firstName,String lastName){
        Animals animal = null;
        if(type.equals("dog")){
            animal = new Dog(firstName,lastName);
            System.out.println("You bought a dog!");
        }else if(type.equals("cat")){
            animal = new Cat();
            System.out.println("You bought a cat!");
        }else if(type.equals("fish")){
            animal = new Fish(firstName,lastName);
            System.out.println("You bought a fish!");
        }else if(type.equals("rabbit")){
            animal = new Rabbit(firstName,lastName);
            System.out.println("You bought a rabbit!");
        }
        return animal;
    }
}
