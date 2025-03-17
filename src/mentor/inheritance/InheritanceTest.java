package mentor.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Kostya", "Chochua", "Chemistry", 4.5);
        Aspirant aspirant1 = new Aspirant("Slava", "Lobov", "Physics", 5.0);
        Student student2 = new Aspirant("Nastya", "Komarova", "Chemistry", 5.0);
        Student student3 = new Student("David", "Shaginyan", "History", 4.0);
        Aspirant aspirant2 = new Aspirant("Petya", "Vasechkin", "Mathematics", 4.5);
        Student[] students = {student1, student2, student3, aspirant1, aspirant2};
        for (Student student: students) {
            student.getScholarship();
        }
    }
}
