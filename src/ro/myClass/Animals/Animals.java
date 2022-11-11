package ro.myClass.Animals;

public abstract class Animals {
    public enum Type { DOG,FISH,CAT,RABBIT };

    Type type = Type.DOG;
    private SoundBehavior soundBehavior;
  private Dog dog;
  private Cat cat;
  private Fish fish;
  private Rabbit rabbit;

  String pet;



    public double cost(){
        double cost = 0.0;
       if(hasDog()){
           cost += dog.cost();
       }else if(hasCat()){
           cost += cat.cost();
       }else if(hasFish()){
           cost += fish.cost();
       }else if(hasRabbit()){
           cost += rabbit.cost();
       }
       return cost;
    }

    public  void sound(){
        System.out.println("Bark bark !");
    }
    public abstract void display();
    public boolean hasDog(){
        if(dog == null){
            return false;
        }
        return true;
    }
    public boolean hasCat(){
        if(cat == null){
           return false;
        }
        return true;
    }
    public boolean hasFish(){
        if(fish == null ){
            return false;
        }
        return true;
    }
    public boolean hasRabbit(){
        if(rabbit == (null)){
            return false;
        }
        return true;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public String getPet(){
        if(type == Type.DOG){
            this.pet = "dog";
        } else if (type == Type.CAT) {
            this.pet = "cat";
        } else if (type == Type.FISH) {
            this.pet = "fish";
        } else if(type == Type.RABBIT){
            this.pet = "rabbit";
        }
        return pet;

        }
    }

