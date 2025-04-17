import com.example.zooManagementSystem.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Rey", 5);
        Parrot parrot = new Parrot("Polly", 2);

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);

        zoo.showAllAnimals();
        zoo.simulateAnimalSounds();
    }
}
