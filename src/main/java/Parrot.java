public class Parrot extends Animal{

    //constructor
    public Parrot(String name, int age){

        super(name, age, "Bird");
    }

    @Override
    public void makeSoud(){
        System.out.println("Squawk! I'm a Parrot!");
    }
}
