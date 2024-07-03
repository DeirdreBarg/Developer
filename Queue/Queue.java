/**
 * Queue
 */
public class Queue<E> {
    Object[] data;

    Queue( int capacity) {
        data  = new Object[capacity];
    }
    int firstInLine = 0;
    int lastSpot = 0;

    /**
     * Adds the 
     * @param n
     */
    // public void addToQ(int n){
    //     data[lastInLine] = n;
    //     lastInLine += 1;
    // }

    public void lastInLine(int newNum) {
        if (lastSpot == data.length && firstInLine == ) {
            
        }
    }

    public static int minSteps(int[][] area, int row, int col) {

        // Base case of at the edge
        if (row == 0 || row == area.length - 1 || col == 0 || col == area[0].length - 1) {
            return 0;
        }

        int minUp;
        int diff = area[row - 1][col] - area[row][col];

        if (diff >= -10 && diff <= 10) {
            minUp = minSteps(area, row - 1, col);            
        } else {
            minUp = Integer.MAX_VALUE;
        }

        int minRight;
        int diff = area[row][col] - area[row][col];

        if (diff >= -10 && diff <= 10) {
            minUp = minSteps(area, row - 1, col);            
        } else {
            minUp = Integer.MAX_VALUE;
        }

        int minDown;
        int diff = area[row - 1][col] - area[row][col];

        if (diff >= -10 && diff <= 10) {
            minUp = minSteps(area, row - 1, col);            
        } else {
            minUp = Integer.MAX_VALUE;
        }

        int minLeft;
        int diff = area[row - 1][col] - area[row][col];

        if (diff >= -10 && diff <= 10) {
            minUp = minSteps(area, row - 1, col);            
        } else {
            minUp = Integer.MAX_VALUE;
        }


        int min = Integer.MAX_VALUE;

        if (minUp < min) {
            min = minUp;
        }
        if (minRight < min) {
            min = minRight;
        }
        if (minDown < min) {
            min = minDown;
        }
        if (minLeft < min) {
            min = minLeft;
        }

        return 1 + min;
    }
}