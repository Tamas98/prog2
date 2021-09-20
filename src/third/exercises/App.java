package third.exercises;

/**
 * TODO docme.
 */
public class App {
    public static final String TEST_SZOVEG = "Szeretem a tejet!";

    public static void main(String[] args) {
        ThirdLessonService thirdLessonService = new ThirdLessonService();

        // 1. feladat
        thirdLessonService.eltolas(TEST_SZOVEG);
        // 2. feladat
        thirdLessonService.csere(TEST_SZOVEG);
        // 3. feladat
        thirdLessonService.printFrom1To100();
        // 4. feladat
        thirdLessonService.fizzbuzz();
        // 5. feladat
        thirdLessonService.minMax(new int[] {151525, 25561, 2612 ,353 ,526, 421, 732, 61615, 613151, 6136773, 7521, 125215, 641251});
        // 6. feladat
        thirdLessonService.fibonacci(20);
        // 7. feladat
        System.out.println(thirdLessonService.isPrime(100));
        System.out.println(thirdLessonService.isPrime(50051));
        // 8. feladat
        System.out.println(thirdLessonService.isPalindrome("Palindrome"));
        System.out.println(thirdLessonService.isPalindrome("Racecar"));
    }
}
