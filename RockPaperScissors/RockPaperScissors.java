import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * RockProject
 */
public class RockPaperScissors {
    static String displayName = "Rock paper scissors!";
    int userScore = 0;
    int computerScore = 0;
    String difficulty;
    ArrayList<String> choices;
    String[] validOptions = {"Rock", "Paper", "Scissors", "Stop"};
    String[] validComputerOptions  = {"Rock" , "Paper" ,"Scissors"};
    static Scanner scanner = new Scanner(System.in);
    int counter = 0;


    // RockPaperScissors(String difficulty) {
    //     this.difficulty = difficulty;
    //     if (this.difficulty == "hard") {
    //         this.choices = new ArrayList<>("Rock", "Paper", "Scissors", "spak";
    //     } else if (this.difficulty == "easy") {
    //         this.choices = new ArrayList<>(){"Rock", "Paper", "Scissors"};
    //     }
    // }

    public void welcomePrompt() {
        System.out.println("________            ______      ________                                ________     _____                                   \n" + //
                "___  __ \\______________  /__    ___  __ \\_____ _____________________    __  ___/________(_)__________________________________\n" + //
                "__  /_/ /  __ \\  ___/_  //_/    __  /_/ /  __ `/__  __ \\  _ \\_  ___/    _____ \\_  ___/_  /__  ___/_  ___/  __ \\_  ___/_  ___/\n" + //
                "_  _, _// /_/ / /__ _  ,<       _  ____// /_/ /__  /_/ /  __/  /        ____/ // /__ _  / _(__  )_(__  )/ /_/ /  /   _(__  ) \n" + //
                "/_/ |_| \\____/\\___/ /_/|_|      /_/     \\__,_/ _  .___/\\___//_/         /____/ \\___/ /_/  /____/ /____/ \\____//_/    /____/  \n" + //
                "                                               /_/                                                                           ");
                System.out.println("Welcome\n" + "You can choose Rock, Paper, Scissors, or Stop to stop playing\n");
    }

    /**
     * Checks the user input to ensure its a valid option
     * @param userInput the user choice
     * @return true if the user choose a valid choice
     */
    public boolean isInputValid(String userInput) {
        List<String> choices = new ArrayList<>(List.of("Rock", "Paper", "Scissors","Stop"));
        return choices.contains(userInput);
    }

    /**
     * Prompts thje user until valid option is entered 
     * @return valid user input
     */
    public String getValidUserInput() {
        System.out.print("Enter your choice: ");
        String userInput = scanner.nextLine();
        while (!(isInputValid(userInput))) {
            System.out.println("Invalid input. Enter your choice: ");
            userInput = scanner.nextLine();
        } 
        return userInput;
    }


    /**
     * Gets random conputer choice
     * @return the valid cumputer choice
     */ 
    public String getComputerChoice() {
        int choice = (int) (Math.random() * validComputerOptions.length);
        System.out.println("The Computer Choose: " + validComputerOptions[choice] + "\n");
        return validComputerOptions[choice];   
    }
    
    /**
     * the three possible game outcomes
     */
    enum GameOutcome {
        User,
        Computer,
        Tie
    }

     /**
      * Finds winner given user and computer input
      * @param userInput what the user chooses
      * @param computerInput random computer choice
      * @return the winner of the round
      */
    public GameOutcome compare(String userInput, String computerInput) {
        if (userInput.equals(computerInput)) {
            return GameOutcome.Tie;
        } else if (userInput.equals("Rock") && computerInput.equals("Scissors")) {
            return GameOutcome.User;
        } else if (userInput.equals("Paper")&& computerInput.equals("Rock")) {
            return GameOutcome.User;
        } else if (userInput.equals("Scissors") && computerInput.equals("Paper")) {
            return GameOutcome.User;
        } else {
            return GameOutcome.Computer;
        }
    }

    /**
     * Prints who wins and updates the user score/computer score and round
     * @param winner of the round
     */
    public void updateScore(GameOutcome winner) {
        if (winner == GameOutcome.User) {
            userScore++; 
            System.out.println("You win!\n");                   
        } else if (winner == GameOutcome.Computer) {
            computerScore++;
            System.out.println("Computer wins!\n");
        } else if (winner == GameOutcome.Tie) {
            System.out.println("Tie Game\n");
        } 
        System.out.println("User Score is: " + userScore + "\nComputer Score is: " + computerScore);
        counter++;
        System.out.println("Round: " + counter + "\n");
        System.out.println("***************************************************");
    }

    /**
     * runs the instance of the game until user chooses to stop playing
     * Closes the scanner when completed
     */
    public void playRockPaperScissors() {
        welcomePrompt();
        String userInput = getValidUserInput();
        while (!(userInput.equals("Stop"))) {
            String computerChoice = getComputerChoice();
            GameOutcome winner = compare(userInput, computerChoice);
            updateScore(winner);
            userInput = getValidUserInput();
        } 
        scanner.close();
    }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playRockPaperScissors();
    }
}