package Level_2;
import java.util.*;

class Rectangle{

    int length;
    int breadth;

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double areaR(){
        return length*breadth;
    }
}
class Triangle{
    int height;
    int base;
    
    public Triangle(int height,int base){
        this.height = height;
        this.base = base;
    }

    public double areaT(){
        return 0.5 * height * base;
    }
}
public class Area2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle rec = new Rectangle(length, breadth);
        double ar = rec.areaR();
        System.out.println("Area of rectangle is : " + ar);

        System.out.print("Enter height and base : ");
        int height = sc.nextInt();
        int base = sc.nextInt();
        Triangle tr = new Triangle(height, base);
        double area = tr.areaT();
        System.out.println("Area of Triangle: " + area); 
        sc.close();
    }
}
