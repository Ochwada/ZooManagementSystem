public class Lion extends Animal{
    private String type;
    // Constructor
    public Lion(String type){
        super("Mammal");
    }

    }
    @Override
    public void makesound(){
        System.out.println("Roar! I'm a Lion!");
    }

}