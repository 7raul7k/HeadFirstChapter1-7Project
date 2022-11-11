package ro.myClass.Animals;

public class FoodYesCommand implements Command {
    String type;
    ROAnimalStore roAnimalStore;
    Animals animals;

    public FoodYesCommand(String type) {
        this.type = type;
        this.roAnimalStore = new ROAnimalStore();
    }

    @Override
    public void execute() {
        this.animals = roAnimalStore.order(type,true,false,false);

    }
    public double price(){
        this.execute();
        return animals.cost();
    }

}
