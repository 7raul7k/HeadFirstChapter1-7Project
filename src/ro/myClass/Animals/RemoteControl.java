package ro.myClass.Animals;

public class RemoteControl {
    Command[] yesCommand;

    double[] price;
    Command undoCommand;

    String[] animals;
    String[] firstName;
    String[] lastName;


    public RemoteControl(){
        yesCommand = new Command[10];
        animals = new String[10];
        price = new double[10];
        firstName = new String[10];
        lastName = new String[10];
        Command cmmd = new NoComand();
        for(int i=0;i<10;i++){
            yesCommand[i] = cmmd;
        }
        undoCommand = cmmd;
    }
    public void setCommand(int slot,String fName,String lName,Command yes,double p,Animals animal){

        this.price[slot] = p;
        yesCommand[slot] = yes;
        animals[slot] = animal.pet;
        firstName[slot] = fName;
        lastName[slot] = lName;

    }
    public void yesButtonWasPushed(int slot){
        yesCommand[slot].execute();
        undoCommand = yesCommand[slot];
    }



    public void undoButtonWasPushed(){undoCommand.execute();}

    public String toString(){
        double totalPrice = 0;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------ Cart --------------------\n");
        for(int i = 0; i < yesCommand.length;i++) {
                stringBuffer.append("[slot" + i + "]" + firstName[i] + " " + lastName[i] + " | " + yesCommand[i].getClass().getName()
                        + "     " + "$" + price[i] + "     " +
                        " Animal: " + animals[i] + "\n");
                totalPrice += price[i];

        }
        stringBuffer.append("[undo]" + undoCommand.getClass().getName() + "\n");
        stringBuffer.append("Total Price:  $" + totalPrice);
        return stringBuffer.toString();
    }

}
