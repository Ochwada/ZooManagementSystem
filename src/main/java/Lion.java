public class Lion extends Animal{

    // Constructor
    public Lion(String name, int age){

        super(name, age, "Mammal");
    }

    }

    @Override
    public void makesound(){
        System.out.println("Roar! I'm a Lion!");
    }

}