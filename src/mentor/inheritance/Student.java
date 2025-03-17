package mentor.inheritance;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected double averageMark;
    public static final int FULL_SCHOLARSHIP_AMOUNT = 100;
    public static final int PARTIAL_SCHOLARSHIP_AMOUNT = 80;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public void getScholarship () {
        if (averageMark==5.0) {
            System.out.println(FULL_SCHOLARSHIP_AMOUNT);
        } else {
            System.out.println(PARTIAL_SCHOLARSHIP_AMOUNT);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
