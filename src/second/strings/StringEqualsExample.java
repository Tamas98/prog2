package second.strings;

/**
 * TODO docme.
 */
public class StringEqualsExample {
    public static void main(String[] args) {
        String one = "ONE";
        String newOne = new String("ONE");
        String oldOne = "ONE";

        System.out.println(one == newOne);
        System.out.println(one.equals(newOne));
        System.out.println(one == oldOne);
        System.out.println(oldOne.equals(one));
    }
}
