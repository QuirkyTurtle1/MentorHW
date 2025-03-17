package mentor.strategy;

public class Piano implements Instrument{
    @Override
    public void play() {
        System.out.println("Vivaldi");
    }

    @Override
    public String toString() {
        return "Piano";
    }
}
