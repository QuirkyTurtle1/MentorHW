package mentor.polimorf;

public class Dog extends Animal{
    private int barkAmount;
    public Dog(String location, String food, int barkAmount) {
        super(location, food);
        this.barkAmount = barkAmount;
    }

    public int getBarkAmount() {
        return barkAmount;
    }

    @Override
    public void eat(Animal animal) {
        super.eat(animal);
    }

    @Override
    public void makeNoise(Animal animal) {
        super.makeNoise(animal);
    }
}
