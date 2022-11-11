package ro.myClass.Animals;

public class Food extends AnimalDecorator{
    private Animals animals;

    public Food(Animals animals) {
        this.animals = animals;
    }

    @Override
    public double cost(){
        double cost = animals.cost();
        if(animals.getType() == Type.CAT ){
            cost +=  30.25;
        }else if(animals.getType() == Type.DOG){
            cost +=  29.99;
        }else if(animals.getType() == Type.RABBIT){
            cost += 26.03;
        }else if(animals.getType() == Type.FISH){
            cost += 19.99;
        }
        return cost;
    }
    @Override
    public void display() {

        animals.display();System.out.print(" Food ");

    }
}
