package GenericsAndCollections;
import java.util.UUID;

class Animal {
    String name;
    String color;
    String type;

    Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return UUID.randomUUID().hashCode();
    }
}

public class prog6 {
    public static void main(String[] args) {
        Animal cat = new Animal("Chuza", "White", "Pet");
        Animal lion = new Animal("Panda", "Golden", "Wild");
        Animal dog = new Animal("Dog", "Brown", "Pet");

        System.out.println("Hashcode of cat: " + cat.hashCode());
        System.out.println("Hashcode of lion: " + lion.hashCode());
        System.out.println("Hashcode of dog: " + dog.hashCode());
    }
}