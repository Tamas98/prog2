package epam.education.prog2.exceptionHandling;

/**
 * TODO docme.
 */
public class ExceptionHandlingExample {

    public void throwsError() throws NoSuchMethodError {
        throw new NoSuchMethodError();
    }

    public void handlingExample() {
        try {
            System.out.println("Try");
            throw new NumberFormatException();
            //System.out.println("Try after throw");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("1. Exception occurred");
            throw new IllegalArgumentException();
        } catch(IllegalArgumentException t) {
            System.out.println("2. Exception occurred");
        }
        finally {
            System.out.println("Finally");
        }
    }

    public void isFinallyAlwaysRuns() {
        try {
            System.out.println("Try");
            //System.exit(1);
            //throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Handling exception");
            System.exit(1);
        } finally {
            System.out.println("Finally");
        }
    }
}
