import com.example.zooManagementSystem.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();



        Animal elephat1 = new Elephant("Leo", 20);
        Animal elephat2 = new Elephant("Mammi", 10);
        elephat1.makeSound();

        zoo.addAnimal(elephat1);
        System.out.println();
        zoo.addAnimal(elephat2);

        zoo.showAllAnimal();


    }
}

