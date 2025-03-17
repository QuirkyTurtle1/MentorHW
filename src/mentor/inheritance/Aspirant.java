package mentor.inheritance;

public class Aspirant extends Student {
    public static final int FULL_SCHOLARSHIP_AMOUNT_ASPIRANT = 200;
    public static final int PARTIAL_SCHOLARSHIP_AMOUNT_ASPIRANT = 180;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship() {
        if (averageMark==5.0) {
            System.out.println(FULL_SCHOLARSHIP_AMOUNT_ASPIRANT);
        } else {
            System.out.println(PARTIAL_SCHOLARSHIP_AMOUNT_ASPIRANT);
        }
    }
}
