import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ScannerTest
 */
public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {        
        File file = new File("te.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}