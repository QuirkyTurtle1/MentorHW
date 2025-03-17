package mentor.polimorf;

public class Horse extends Animal{
    public int horsePower;
    public Horse(String location, String food, int horsePower) {
        super(location, food);
        this.horsePower = horsePower;
    }

    @Override
    public void makeNoise(Animal animal) {
        super.makeNoise(animal);
    }

    @Override
    public void eat(Animal animal) {
        super.eat(animal);
    }
}
