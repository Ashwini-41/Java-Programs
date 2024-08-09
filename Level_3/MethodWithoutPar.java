/*Java Program to Create a Method without Parameters and with Return Type
Explanation:
We have made a method to calculate the volume of a cuboid which takes the dimensions length, 
breadth and height as input and returns the volume as output back to the main method. */
package Level_3;
import java.util.*;

public class MethodWithoutPar {
          int length;
           int breadth;
            int height;
    MethodWithoutPar(int length,int breadth,int height){
      this.length = length;
      this.breadth = breadth;
      this.height = height;
    }
    static Scanner sc = new Scanner(System.in);

    double volume(){
      return length * breadth * height;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter length , breadth, height : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int height = sc.nextInt();

        MethodWithoutPar obj = new MethodWithoutPar(length, breadth, height);
        double cuboidV = obj.volume();
        System.out.println("Volume of cuboid is: " + cuboidV);
        sc.close();
        
    }
}
