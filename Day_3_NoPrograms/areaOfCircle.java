import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius : ");
        double r = sc.nextDouble();

        double ans = area(r);
        System.out.println("The area of circle is : " + ans);
        sc.close();
    }
    static double area(double radius){
        double pi = 3.14;
        double a = pi * radius * radius;
        //double Ar = Math.PI * radius * radius;
        return a;
    }
}
