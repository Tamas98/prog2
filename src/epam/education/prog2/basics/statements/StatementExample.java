package epam.education.prog2.basics.statements;

/**
 * TODO docme.
 */
public class StatementExample {
    public static void main(String[] args) {
        // The if..else if..else statements

        int x = 10;
        int y = 10;

        if(x == y) {
            System.out.println("True case\n");
        } else if(x < y) {
            System.out.println("Else if case\n");
        } else if(x % y == 0) {
            System.out.println("Else if case 2\n");
        } else {
            System.out.println("Else case\n");
        }

        // Ternary operator

        String result = x % y == 0 ? "Zero" : "Else";
        System.out.println(result + "\n");

        // Switch statement

        switch (x % y) {
            case 0:
                System.out.println(String.format("Remainder of %d / %d = 0", x, y));
                break;
            case 1:
                System.out.println(String.format("Remainder of %d / %d = 1", x, y));
                break;
            case 2:
                System.out.println(String.format("Remainder of %d / %d = 2", x, y));
                break;
            case 3:
                System.out.println(String.format("Remainder of %d / %d = 3", x, y));
                break;
            case 4:
                System.out.println(String.format("Remainder of %d / %d = 4", x, y));
                break;
            case 5:
                System.out.println(String.format("Remainder of %d / %d = 5", x, y));
                break;
            default:
                System.out.println("Unhandled remainder");
            }
    }
}
