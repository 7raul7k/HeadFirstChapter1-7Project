package ro.myClass.Animals;

public  class ROAnimalStore {

    SimpleAnimalFactory animalFactory;

    String firstName;

    String lastName;
    public ROAnimalStore(){
        this.animalFactory = new SimpleAnimalFactory();
    }

    RemoteControl remoteControl = new RemoteControl();



    public void addClient(String fName,String lName){
        this.firstName = fName;
        this.lastName = lName;

    }


    public Animals order(String type,boolean food,boolean clothes,boolean accesories){
        Animals animal = animalFactory.createAnimal(type,firstName,lastName);
        System.out.println("Loading products...");
        if(food == true){
            animal = new Food(animal);
            this.food();
        }
        if(clothes == true){
            animal = new Clothes(animal);
            this.clothes();

        }
        if(accesories == true){
            animal = new Clothes(animal);
            this.accesories();
        }
        return animal;

    }



    public void food(){
        System.out.println("Food was added in your cart...");
    }
    public void accesories(){
        System.out.println("Accesories was added in your cart...");
    }
    public void clothes(){
        System.out.println("Clothes was added in your cart");

    }

}
