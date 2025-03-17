package mentor.polimorf;

public class PolimorfTest {
    public static void main(String[] args) {
        Animal animal1 = new Cat("house", "fish", 9);
        Animal animal2 = new Dog("street", "meat", 555);
        Animal animal3 = new Horse("nature", "grass", 999);
        Animal[] animals = {animal1, animal2, animal3};
        Veterinar veterinar = new Veterinar();
        for (Animal animal: animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
