/*3. Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
Explanation:Enter length and breadth of the rectangle as input. After that we create an object of that 
class and pass the reference variable to two different methods. Now we calculate the area for two different
 objects and return them to the main method. Hence we get two different areas as output.
 */
package Level_2;

import java.util.Scanner;

public class Area {
    static Scanner sc = new Scanner(System.in);
    private void areaOfRectangle(int len,int breadth){
        double a = len *breadth;
        System.out.println("Area of rectangle : " + a);
    }
    private void areaOFTriangle(int base,int height){
         double areaOfT = 0.5* (base * height);

         System.out.println("Area of triangle is : " + areaOfT);
    }
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        Area ar = new Area();
        ar.areaOfRectangle(len,breadth);
        ar.areaOFTriangle(len, breadth);
    }
}
