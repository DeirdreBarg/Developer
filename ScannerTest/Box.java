import java.util.Arrays;

public class Box {
    public static void main(String[] args) {
        int[] p = {5, -1, 4, 2, 6};
        for (int i = 1; i < p.length; i++) {
            System.out.println("");
            System.out.println("i is: " + i);
            if (p[i - 1] < p[i]) {
                p[i] *= 2;
            } else {
                System.out.println("p[i] is: " + p[i]);
                System.out.println("p[i - 1] is: " + p[i - 1]);
                p[i] -= p[i - 1] / 2;
            }
        }
        System.out.print(Arrays.toString(p));
    }
}
