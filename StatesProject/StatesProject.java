import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * StatesProject By Deirdre Barg
 */
public class StatesProject {
    static String[][] CAPITALS = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Moines"},
        {"Kansas", "Topeka"},
        {"Kentucky", "Frankfort"},
        {"Louisiana", "Baton Rouge"},
        {"Maine", "Augusta"},
        {"Maryland", "Annapolis"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},
        {"Minnesota", "Saint Paul"},
        {"Mississippi", "Jackson"},
        {"Missouri", "Jefferson City"},
        {"Montana", "Helena"},
        {"Nebraska", "Lincoln"},
        {"Nevada", "Carson City"},
        {"New Hampshire", "Concord"},
        {"New Jersey", "Trenton"},
        {"New Mexico", "Santa Fe"},
        {"New York", "Albany"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismarck"},
        {"Ohio", "Columbus"},
        {"Oklahoma", "Oklahoma City"},
        {"Oregon", "Salem"},
        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
    };

    /* 
     * TODO: Part one
     * 1. Make 2D array: [[Alabama, Montgomery], [Alaska, Juno], ...]
     * 2. Display array
     * 3. Bubble sort array by capitol
     * 4. Promp user for all the Capitols: What is the Capitol of Texas? Austin
     * 5. Return results: You got 40/50 correct!
     * 
     * TODO: Part TWO
     * 1. HashMap
     * 2. TreeMap
     * 3. Prompt user for State to get Capital 
     */

    /**
     * Prints Capitals and States formatted
     * @param capitals States and Capitals
     */
    public static void displayCapitals(String [][] capitals) {
        for (String[] pair : capitals) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }

    /**
     * Prints Capitals and States formatted
     * @param capitals States and Capitals
     */
    public static void displayCapitals(HashMap<String, String> capitals) {
        for (String key : capitals.keySet()) {
            System.out.println(capitals.get(key) + ", " + key);
        }
    }

    /**
     * Prints Capitals and States formatted
     * @param capitals States and Capitals
     */
    public static void displayCapitals(TreeMap<String, String> capitals) {
        for (String key : capitals.keySet()) {
            System.out.println(capitals.get(key) + ", " + key);
        }
    }

    /**
     * Bubble sort based on Capitols 
     * @param capitals 2D array of States and Capitals
     * @return New sorted 2D array of Capitals and States
     */
    public static String[][] bubbleSort(String [][] capitals) {
        String [][] sorted = Arrays.copyOf(capitals, capitals.length);
        int i = 0;
        while (i != sorted.length - 1) {
            if (checkForSwap(sorted[i][1], sorted[i + 1][1]) >= 1) {
                String[] temp = Arrays.copyOf(sorted[i], 2);
                sorted[i][1] = sorted[i + 1][1];
                sorted[i][0] = sorted[i + 1][0];
                sorted[i + 1][1] = temp[1];
                sorted[i + 1][0] = temp[0];
                i = 0;
            }
            else {
                i++;
            }
        }
        return sorted;
    }

    /**
     * Checks if two Citys need to swap
     * @param Capital 1 
     * @param Capital 2 
     * @return a negative if a < b / Positive if a > b or 0 if =
     */
    public static int checkForSwap(String a, String b){
        return a.compareTo(b);
    }

    /**
     * Counts correct answers
     * @param sorted  pairs of States and thier Capital
     */
    public static void testUser(String[][] sorted) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (String[] pair : sorted) {
            System.out.print("What is the Capital of " + pair[0] + ": ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals(pair[1].toLowerCase())) {
                counter++;
            }
        }
        System.out.println("You got " + counter + "/" + sorted.length + " correct!");
        scanner.close();
    } 

    /**
     * Converts capitals into HashMap
     * @param capitals 2d String[] of pairs of States and thier capitals 
     * @return a HashMAp of capitals 
     */
    public static HashMap<String, String> hashifyCapitals(String[][] capitals) {
        HashMap<String, String> hashifyCapitals = new HashMap<>();
        for (String[] pair : capitals) {
            System.out.println("key is: " + pair[0]);
            System.out.println("value is: " + pair[1]);
            hashifyCapitals.put(pair[0], pair[1]);
        }
        return hashifyCapitals;
    }

    /**
     * Converts capitlas to TreeMap
     * @param capitals 2d Array of States and their capitals
     * @return new TreeMap
     */
    public static TreeMap<String, String> treeifyCapitals(String[][] capitals) {
        TreeMap<String, String> treeify = new TreeMap<>();
        for (String[] pair : capitals) {
            treeify.put(pair[1], pair[0]);
        }
        return treeify;
    }

    /**
     * Propmts user for State they want the Capital of
     * @param capitals The Capital HashMap
     */
    public static void capitalSearch(HashMap<String, String> capitals) {
        boolean shouldPrompt = true;
        Scanner scanner = new Scanner(System.in);
        
        while (shouldPrompt) {
            System.out.print("Enter a State: ");
            String input = scanner.nextLine();

            System.out.println("The Capital is: " + capitals.get(input));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        displayCapitals(CAPITALS);
        String[][] sorted = bubbleSort(CAPITALS);
        testUser(sorted);
        HashMap<String, String> capitalMap = hashifyCapitals(CAPITALS);
        displayCapitals(capitalMap);
        TreeMap<String, String> capitalTree = treeifyCapitals(CAPITALS);
        displayCapitals(capitalTree);
        capitalSearch(capitalMap);    
    }
}
