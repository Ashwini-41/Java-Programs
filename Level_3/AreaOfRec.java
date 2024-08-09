/*ava Program to Create a Method with 2 Parameters and without Return Type
Explanation: Enter the length and breadth of the rectangle as input. Now we pass these values as parameters
 to the new method where we calculate the area and print the output. */
package Level_3;
import java.util.*;

public class AreaOfRec {

    static void rectangleArea(int length,int breadth){
        double ar = length * breadth;
        System.out.println("Area of rectangle is: " + ar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length , breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        rectangleArea(length,breadth);
        sc.close();

    }
}
