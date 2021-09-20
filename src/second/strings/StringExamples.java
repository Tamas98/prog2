package second.strings;

/**
 * TODO docme.
 */
public class StringExamples {
    public static void main(String[] args) {
        String ik = "Informatikai kar " + "2021";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ik.length(); i++) {
            sb.append("asd");
            System.out.println(ik.charAt(i));
            sb.toString();
            sb.append("a");
        }
    }
}
