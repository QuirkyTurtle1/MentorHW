package mentor.strategy;

public class Guitar implements Instrument{
    @Override
    public void play() {
        System.out.println("AC/DC");
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}
