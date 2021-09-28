package epam.education.prog2.basics.loops;

/**
 * TODO docme.
 */
public class LoopsExample {
    public static void main(String[] args) {
        int divisors = 0;
        int currentNumber = 1;
        int number = 5526;

        while(divisors < 10) {
            if(number % currentNumber == 0) {
                divisors += 1;
            }
            currentNumber += 1;
        }

        System.out.println(String.format("Last found divisor: %d\n", currentNumber));

        System.out.println("For loop: ");
        String test = "Epam Systems";
        for(int i = 0; i < test.length(); i++) {
            System.out.println(test.charAt(i));
        }

        System.out.println("\nFor-each loop: ");
        for(char c: test.toCharArray()) {
            System.out.println(c);
        }
    }
}
