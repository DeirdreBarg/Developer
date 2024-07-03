/**
 * ProjectTwo: Implementing Arrays, Classes, and Methods
 * 109: Intro to Programming
 * By: Deirdre Barg 
 * Objective: write an object-oriented program to create classes 
 * and methods for area and volume calculations.


 */
public class ProjectTwo {

    Scanner scanner = new Scanner(System.in);

    public static int getValidUserShape() {


        return 0;
    }

    public static void main(String[] args) {
        int shape = getValidUserShape();
        makeShape(shape);
        Rectangle rec =  new Rectangle(5, 5);
        float area =  rec.getArea();
        System.out.println("area is: " + area);
    }
}