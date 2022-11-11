package ro.myClass.Animals;

public class AccesoriesYesCommand implements Command{
    ROAnimalStore animalStore;

    Animals animals;

    String type;

    public AccesoriesYesCommand(String type){
        this.type = type;
        this.animalStore = new ROAnimalStore();
    }

    @Override
    public void execute() {
        this.animals = animalStore.order(type,false,false,true);
    }

    public double price(){
        this.execute();
        return animals.cost();
    }


}
