package third.arrays.myArray;

/**
 * TODO docme.
 */
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(10); // Size
        myArray.add(2); //add new
     //   myArray.add(2, 4); // Add 2 to the 2. index.
        myArray.remove(); // remove
        System.out.println(myArray.get(5)); // get, if not exists return null!!
        System.out.println(myArray.length()); // return the length of the array
    }
}
