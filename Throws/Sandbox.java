import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Sandbox
 */
public class Sandbox {
    public static void main(String[] args) throws FileNotFoundException, RatDogException {
        try {
            // Scanner input = new Scanner(new File("hours.txt"));
            throwing(-1);
        } catch (Exception e) {
            System.err.println("The exception is: " + e.getLocalizedMessage());
        }
    }

    public static int throwing(int x) throws RatDogException {
        if (x < 0) {
            throw new RatDogException("The variable was below 0");
            // throw new IndexOutOfBoundsException();
        }
        return x;
    }
}