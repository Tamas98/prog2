package epam.education.prog2.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * TODO docme.
 */
public class IOExample {

    private final Scanner scanner = new Scanner(System.in);

    public int sumCalculator() {
        int input = 1;
        int sum = 0;
        while(input != 0) {
            System.out.print("Enter a number: ");
            input = readIntFromUser();
            sum += input;
        }
        System.out.print("The sum of the given numbers: ");
        return sum;
    }

    private int readIntFromUser() {
        int result = 0;
        for(int i = 0;i < 10; i ++) {
            try {
                result = this.scanner.nextInt();
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please give me a valid number.");
            }
        }
        throw new IllegalArgumentException("Too many invalid tries!");
    }

    public void readFromFile() throws IOException {
        File myObj = new File("resources/test.txt");
        Scanner sc = new Scanner(myObj);
        while(sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

    public void writeToFile(String text) throws IOException {
        File file = new File("resources/test.txt");
        FileWriter fw = new FileWriter(file);
        fw.append(text);
        fw.flush();
        fw.close();
    }
}
