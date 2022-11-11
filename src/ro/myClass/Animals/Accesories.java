package ro.myClass.Animals;

public class Accesories extends  AnimalDecorator {
    private Animals animals;

    public Accesories(Animals animals){
        this.animals = animals;
    }

    @Override
    public double cost() {
        double cost = animals.cost();
        if(animals.getType() == Type.DOG){
            cost += 7.25;
        }else if(animals.getType() == Type.CAT){
            cost += 6.07;
        }else if(animals.getType() == Type.RABBIT){
            cost += 5.79;
        }else if (animals.getType() == Type.FISH){
            cost += 4.99;
        }
        return cost;
    }

    @Override
    public void display() {

        animals.display();System.out.print(" Accesories");
    }
}
