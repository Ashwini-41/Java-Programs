/*Java Program to Implement Shape Interface using Circle and Rectangle Class
Explanation:Interfaces are syntactically similar to classes, but they lack instance variables, and 
their methods are declared without any body. Here we make the interface as Shape with two methods as
 input() and area() which are implemented by further two classes as circle and rectangle who implements
  the interface Shape.
*/
package Level_3;
import java.util.*;

interface Shape{
    void input();

    void area();
}

class Circle implements Shape{
    Scanner sc = new Scanner(System.in);
     public  void input(){
         
          System.out.println("Shape is circular ");
     }
     public void area(){
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        double ar = Math.PI * Math.pow(r, 2);
        System.out.printf("Area of cicle is: %.2f%n",ar);
     }
}

class Rectangle implements Shape{
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Shape is rectangle");
    }
    public void area(){
      System.out.print("Enter length: ");
      int len = sc.nextInt();

      System.out.print("Enter breadth: ");
      int br = sc.nextInt();

      double ar = len * br;
      System.out.println("Area of rectangle is: " + ar);
    }
}

public class Interface {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Rectangle rec = new Rectangle();
        obj.input();
        obj.area();
        rec.input();
        rec.area();
    }
    
}
