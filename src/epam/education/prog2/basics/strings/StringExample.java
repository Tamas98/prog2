package epam.education.prog2.basics.strings;

/**
 * TODO docme.
 */
public class StringExample {
    public static void main(String[] args) {
        // Declarations
        String str = "Epam";
        String newStr = new String("Epam");
        String newStr2 = new String("Epam");


        // Equals

        System.out.println(str == newStr);
        System.out.println("equals: " + str.equals(newStr));
        System.out.println(newStr == newStr2);
        System.out.println("equals: " + newStr.equals(newStr2));
        System.out.println(str == "Epam");

        String epam = "Epa";
        epam += "m";

        System.out.println("\nTest:");
        System.out.println(epam.equals(str));
        System.out.println(str == epam);

        // Some important method
        String test = "Epam Systems";

        System.out.println("\nSome important String class method: ");
        System.out.println("charAt: " + test.charAt(4));
        System.out.println("length: " + test.length());
        System.out.println("format: " + String.format("%s is one of the %d childs of %s", test, 4, "Loki"));
        System.out.println("substring: " + test.substring(2, 4));
        System.out.println("contains: " + test.contains("Jor"));
        System.out.println("valueOf: " + String.valueOf(123415));
        System.out.println("replace: " + test.replace('s', 'X'));
        System.out.println("split: " + test.split("s")[0]);
        System.out.println("indexOf: " + test.indexOf("s"));
        System.out.println("trim: " + test.trim());
    }
}
