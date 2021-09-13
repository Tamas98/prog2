package second.ooconcepts.encapsulation;

/**
 * TODO docme.
 */
public class EncapsulationExample {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student("Test Elek", 22, 3, 4L);
        Student studentC = new Student("Test Elek", 25, 5, 4L);

        System.out.println(studentB.equals(studentC));
        System.out.println(studentB.calculateGrade());
        System.out.println(studentC.calculateGrade());
    }
}
