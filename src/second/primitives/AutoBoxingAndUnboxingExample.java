package second.primitives;

/**
 * TODO docme.
 */
public class AutoBoxingAndUnboxingExample {
    public static void main(String[] args) {
        int example = 2021;
        Integer bigExample = new Integer(example);

        System.out.println(example == bigExample);
        System.out.println(bigExample.equals(example));

        Integer cached1 = 127;
        Integer cached2 = 127;

        System.out.println(cached1 == cached2);

        Integer notCached1 = 128;
        Integer notCached2 = 128;

        System.out.println(notCached1 == notCached2);

        Integer isCached1 = new Integer(120);
        Integer isCached2 = new Integer(120);

        System.out.println(isCached1 == isCached2);
        System.out.println(isCached1.equals(isCached2));

    }
}
