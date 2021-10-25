package epam.education.prog2.io;

import java.io.IOException;

/**
 * TODO docme.
 */
public class IOMain {
    public static void main(String[] args) throws IOException {
        IOExample ioExample = new IOExample();
        //System.out.println(ioExample.sumCalculator());
        ioExample.readFromFile();
       ioExample.writeToFile("Hello There!");
       ioExample.readFromFile();
    }
}
