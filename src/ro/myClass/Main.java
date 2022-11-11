package ro.myClass;

import ro.myClass.Animals.*;
import ro.myClass.Weather.*;

public class Main {

    public static void main(String[] args) {
        Animals dog = new Dog("Alex","Popescu");
        RemoteControl remoteControl =  new RemoteControl();
       FoodYesCommand foodYesCommand = new FoodYesCommand(dog.getPet());
        remoteControl.setCommand(0,"Alex","Popescu",foodYesCommand, foodYesCommand.price(),dog);

        Animals cat = new Cat();
        AccesoriesYesCommand command = new AccesoriesYesCommand(cat.getPet());
        remoteControl.setCommand(1,"Alex","Popescu",foodYesCommand, command.price(), cat);
        System.out.println(remoteControl);

    }
}