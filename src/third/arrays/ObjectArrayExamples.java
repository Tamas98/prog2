package third.arrays;

/**
 * TODO docme.
 */
public class ObjectArrayExamples {

    CustomClass[] customClasses = {
            new CustomClass("Tamás"),
            new CustomClass("András"),
            new CustomClass("Ágnes")
    };

    public void printObjectArray(CustomClass[] objects) {
        for(CustomClass obj: objects) {
            System.out.println(obj.getName());
        }
    }

    public void printObjectArray(Object[] objects) {
        System.out.println("Unrecognized type");
    }
}
