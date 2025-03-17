package mentor.polimorf;

public class Animal {
    private String food;
    private String location;

    public Animal(String location, String food) {
        this.location = location;
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise(Animal animal) {
        System.out.println(animal +" makes noise");
    }
    public void eat(Animal animal) {
        System.out.println(animal +" eats");
    }
    public void sleep(Animal animal) {
        System.out.println(animal +" sleeps");
    }
}
