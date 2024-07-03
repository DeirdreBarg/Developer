import java.util.ArrayList;
import java.util.Arrays;

/**
 * Subset
 */
public class Subset {
    int[] data;

    Subset(int[] data){
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * Given a unique array of ints, print all the possible subsets
     * @param data unique set if ints
     */
    public void allSubsets(int[] data) {
        int[] subset = new int[data.length];
        recursiveHelper(data, subset, 0);
    }

    /**
     * Uses recursion to go through all the possible subsets of the given array
     * @param data the given array of unique numbers
     * @param subset the current subset we are creating 
     * @param start where we want to start in the data array
     */
    public void recursiveHelper(int[] data, int[] subset, int start){
        if (start == data.length) {
            printSubset(subset);
            return;
        }
        subset[start] = -1;
        recursiveHelper(data, subset, start + 1);
        subset[start] = data[start];
        recursiveHelper(data, subset, start + 1);
    }

    
    /**
     * Prints all non null items in the given array
     * @param subset the current array we want to print for the client
     */
    public void printSubset(int[] subset) {
        for (int i = 0; i < subset.length; i++) {
            if (subset[i] != -1) {
                System.out.print(subset[i] + " ");
            }
        }
        System.out.println();
    }


    



}