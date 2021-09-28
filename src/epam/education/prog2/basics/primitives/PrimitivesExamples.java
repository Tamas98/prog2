package epam.education.prog2.basics.primitives;

/**
 * TODO docme.
 */
public class PrimitivesExamples {
    public static void main(String[] args) {
        // Primitives

        byte b;
        short s;
        char c;
        int i;
        long l;
        float f;
        double d;
        boolean bool;

        // Wrapper classes

        Byte byteWrapper;
        Short shortWrapper;
        Character charWrapper;
        Integer intWrapper;
        Long longWrapper;
        Float floatWrapper;
        Double doubleWrapper;
        Boolean booleanWrapper;

        // Autoboxing and unboxing example

        System.out.println("Autoboxing and unboxing:");
        Integer autoboxingExample = 130;
        int autoboxingExample2 = 130;
        System.out.println(autoboxingExample == autoboxingExample2);
        System.out.println(autoboxingExample.equals(autoboxingExample2));
        Integer autoboxingExample3 = 130;
        System.out.println(autoboxingExample == autoboxingExample3);

        // Danger
        System.out.println("\nWatch out!!");
        System.out.println(myEquals(autoboxingExample, autoboxingExample3));
        System.out.println(myEquals(autoboxingExample, autoboxingExample2));
        System.out.println(myEquals(autoboxingExample2, 130));
    }

    private static boolean myEquals(Integer num1, int num2) {
        return num1 == num2;
    }
}
