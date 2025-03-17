package mentor.strategy;

public class Musician {
    private Instrument instrument;

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public void startPlay () {
        System.out.println("Go to the"+ instrument +" and started to play ");
        instrument.play();
    }
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
