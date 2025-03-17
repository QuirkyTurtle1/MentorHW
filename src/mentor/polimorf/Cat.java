package mentor.polimorf;

public class Cat extends Animal{
    public int countOfLives;
    public Cat(String location, String food, int countOfLives) {
        super(location, food);
        this.countOfLives = countOfLives;
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
