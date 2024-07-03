import java.util.ArrayList;
import java.util.Scanner;

/**
 * ConnectFour
 */
public class ConnectFour {
    char [][] gameBoard = new char [6][7];
    boolean doesWinnerExist = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> choices;
    char playerOneToken = 'X';
    char playerTwoToken = 'Y';
    int maxRow = gameBoard.length;
    int maxCol = gameBoard[0].length;  

    enum Player {
        One,
        Two
    }

    /**
     * Constructor on the class Connect four
     * Creating an empty Game Board
     */
    ConnectFour() {
        // Initalizing the array as empty
        for (int row = 0; row < gameBoard.length; row++) {
            char [] rowArray = gameBoard[row];
            for (int column = 0; column < rowArray.length; column++) {
                gameBoard[row][column] = 'O';
            }
        }
    }

    /**
     * Plays a new instance of thye game by alternating turns until a winner is found
     */
    public void playGame() {
        welcome();
        int gameTurns = 0;
        while (!doesWinnerExist) {   
            if (gameTurns % 2 == 0) {
                playerTurn(Player.One, playerOneToken);
            } else {
                playerTurn(Player.Two, playerTwoToken);
            }
            gameTurns++;
        }
    }

    /**
     * Completes full turn for player
     * @param player The player of the turn
     * @param playerToken The charachter that represents player on the board
     */
    public void playerTurn(Player player, char playerToken) {
        int playerMove = getValidMove(player);
        updateGameState(playerMove, playerToken);
        displayStatus();
    }

    public void welcome() {
        System.out.print("  ___  __   __ _  __ _  ____  ___  ____    ____  __   _  _  ____ \n" + //
                " / __)/  \\ (  ( \\(  ( \\(  __)/ __)(_  _)  (  __)/  \\ / )( \\(  _ \\\n" + //
                "( (__(  O )/    //    / ) _)( (__   )(     ) _)(  O )) \\/ ( )   /\n" + //
                " \\___)\\__/ \\_)__)\\_)__)(____)\\___) (__)   (__)  \\__/ \\____/(__\\_)");
        System.out.println("\nPlayer One is 'X' and Player Two is 'Y'");
        System.out.println("The options are 1 - 7");
        System.out.println("First player to get four in a row wins! Good Luck!");
        System.out.println();
        displayStatus();
        System.out.println();
    }

    public boolean isInputValid(int userInput) {
        ArrayList<Integer> choices = new ArrayList<>();
            for (int i = 0; i <= 7; i++) {
                choices.add(i);
        }
        return choices.contains(userInput);
    }


    public int getValidMove(Player player) {
        System.out.println("Player " + player + " please enter your move");
        int userInput = scanner.nextInt();
        while (!(isInputValid(userInput))) {
            System.out.println("Invalid input. Enter your move: ");
            userInput = scanner.nextInt();
        }
         return userInput;
    }

    public void updateGameState(int playerMove, char userToken) {
        int row = -1; // Initialize to an invalid value
        for (int i = 5; i >= 0; i--) {
            if (gameBoard[i][playerMove - 1] == 'O') { // Check if the slot is empty ('O')
                row = i;
            break; // Found an empty slot, exit the loop
            }
        }
        if (row != -1) {
            gameBoard[row][playerMove - 1] = userToken; // player token x & y
        }
        if (checkForWin(row, playerMove - 1, userToken)) {
            doesWinnerExist = true;
            System.out.println("Winner is " + userToken);
        }
    }

    public int addition(int x, int y) {
        return x + y;
    }

    /**
     * Checks to see if the board is full 
     * @return wether the board is full
     */
    public boolean isBoardFull() {
       for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                if (gameBoard[row][col] == 'O') {
                    return false;
                }
            }
        }
        return true;
    }


    public void displayStatus() {
        // Prints the board
        for (int row = 0; row < gameBoard.length; row++) {
            char [] rowArray = gameBoard[row];
            System.out.print(" | ");
            for (int column = 0; column < rowArray.length; column++) {
                System.out.print(gameBoard[row][column] + " ");
            }
            System.out.print("|");
            System.out.println();
        }        
        System.out.print("  ");
        // Prints numbers of columns on the bottom
        for (int column = 0; column < gameBoard[0].length; column++) {
            System.out.print(" " + (column + 1));
        }
        System.out.println("\n");
    }

    public boolean checkForWin(int row, int column, char playerToken) {
        return isHorizontalWin(row, column, playerToken) ||
        isVerticalWin(row, column, playerToken) ||
        isDiagionalWinOne(row, column, playerToken) ||
        isDiagionalWinTwo(row, column, playerToken);
    
    }

    public boolean isHorizontalWin(int row, int col, char playerToken) {
        // check horizontal
        int counter = 0;
        for (int i = 0; i < gameBoard[row].length; i++) {
            if (gameBoard[row][i] != playerToken) {
                counter = 0;
            }
            else {
                if (counter == 0) {
                    counter = 1;
                }
                else {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                }      
            }
        } 
        return false;
    }

    public boolean isVerticalWin(int row, int col, char playerToken) {
        // Checking for vertical four in a row
        int counter = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][col] != playerToken) {
                counter = 0;                
            }
            else {
                if (counter == 0) {
                    counter = 1;
                }
                else {
                    counter++;
                    if (counter == 4) {
                        return true;
                    }
                }
            }
            
        }
        return false;
    }



    public boolean isDiagionalWinOne(int row, int col, char playerToken) {
        while (!(row == 5 || col == 0)) {
            row++;
            col--;
        }
        int counter = 0;
        // Checking bottom left to top right diagional
        while (row >= 0 && row < maxRow && col >= 0 && col < maxCol) {
            if (gameBoard[row][col] != playerToken) {
                counter = 0;
            }
            else {
                counter++;
                if (counter == 4) {
                    return true;
                }
            }
        row--;
        col++;
        }
        return false;
    }

    public boolean isDiagionalWinTwo(int row, int col, char playerToken) {
        while (!(row == 5 || col == 6)) {
            row++;
            col++;
        }
        int counter = 0;
        // Checking the bottom right to the top left diagional 
        while (row >= 0 && row < maxRow && col >= 0 && col < maxCol) {
            if (gameBoard[row][col] != playerToken) {
                counter = 0;
            }
            else {
                counter++;
                if (counter == 4) {
                    return true;
                }
            }
        row--;
        col--;
        }
        return false;
    }

    


    public static void main(String[] args) {
       ConnectFour game = new ConnectFour();
       game.playGame();
    }
}