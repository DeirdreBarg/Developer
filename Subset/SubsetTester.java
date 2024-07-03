/**
 * SubsetTester
 */
public class SubsetTester {

    public static void main(String[] args) {
        
    int[] data = new int[3];
    data[0] = 1;
    data[1] = 2;
    data[2] = 3;
    Subset s = new Subset(data);
    s.allSubsets(data);
    

    }
}