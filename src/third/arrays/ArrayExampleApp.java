package third.arrays;

/**
 * TODO docme.
 */
public class ArrayExampleApp {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
        System.out.println("int array: ");
        arrayExamples.printArray(arrayExamples.numArray);
        System.out.println("\n\n\nInteger Array: ");
        arrayExamples.printArray(arrayExamples.integerArray);
        System.out.println("\n\n\nArray with forEach: ");
        arrayExamples.printArray2(arrayExamples.numArray2);
        System.out.println("\n\n\nMulti Dim Array with forEach: ");
        arrayExamples.printArrayMultiDim(arrayExamples.numArrayMultiDim);

        ObjectArrayExamples objectArrayExamples = new ObjectArrayExamples();
        System.out.println("\n\n\nCustom object Array with forEach: ");
        objectArrayExamples.printObjectArray(objectArrayExamples.customClasses);
        System.out.println("\n\n\nCustom object Array with forEach: ");
        objectArrayExamples.printObjectArray(new OtherCustomClass[]{new OtherCustomClass()});
    }
}
