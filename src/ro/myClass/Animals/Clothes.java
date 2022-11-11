package ro.myClass.Animals;

public class Clothes extends AnimalDecorator {
    private Animals animals;
    public Clothes(Animals animals){
        this.animals = animals;
    }

    @Override
    public void display() {
        animals.display();System.out.print(" Clothes ");
    }
    @Override
    public double cost(){
        double cost = animals.cost();
      if(animals.getType() == Type.DOG){
          cost += 20.50;
      }else if (animals.getType() == Type.CAT){
          cost += 17.30;
        }else if(animals.getType() == Type.RABBIT){
          cost += 10;
        }
      return cost;
    }
}
