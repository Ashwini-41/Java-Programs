/*
 * Java Program to Show the Nesting of Methods
   Explanation: Enter length, breadth and height as input. After that we first call the volume method.
    From the volume method we call the area method and from the area method we call perimeter method. 
    Hence we get the perimeter, area and volume of the cuboid as output.
 */
package Level_2;
import java.util.*;


public class NestingOfMethod {
    private double perimeterC(int length,int breadth,int height){
        return 4 * (length + breadth + height);
    }
    private double areaC(int length,int breadth,int height){
        //Surface Area=2(lw+lh+wh)
        double perimeter = perimeterC(length,breadth,height);
        System.out.println("Perimeter of couboid is: " + perimeter);
        return 2 * (length *breadth + length *height + breadth *height);
    }
    private double volume(int length,int breadth,int height){
        double area = areaC(length,breadth,height);
        System.out.println("Area of cuboid is: " + area);

        return length*breadth*height;
            
    }
    public static void main(String[] args) {
        NestingOfMethod  obj = new NestingOfMethod();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = sc.nextInt();
        System.out.print("Enter height : ");
        int height = sc.nextInt();
        sc.close();

        double V = obj.volume(length,breadth,height);
        System.out.println("Volume of cuboid is : " + V);

        


    }
}
