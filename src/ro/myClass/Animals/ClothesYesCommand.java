package ro.myClass.Animals;

public class ClothesYesCommand implements Command {
    String type;
    ROAnimalStore animalStore;
    Animals animals;

    public ClothesYesCommand(String type){
        this.type = type;
        this.animalStore = new ROAnimalStore();
    }

    @Override
    public void execute() {
        this.animals = this.animalStore.order(type,false,true,false);

    }
    public double price(){
        this.execute();
        return animals.cost();
    }
}
