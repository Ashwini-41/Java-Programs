//Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
package Level_2;

public class MethodOverloadingArea {
    void area(int side){
        double ar = side * side;
        System.out.println("Area of square is: " + ar);
    }
    void area(int length,int breadth){
        double area = length * breadth;
        System.out.println("Area of rectangle is : " + area);
    }
    void area(double radius){
        double ar = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of circle is: %.2f%n" ,ar);
    }
    public static void main(String[] args) {
        MethodOverloadingArea obj = new MethodOverloadingArea();
        obj.area(25);
        obj.area(20,30);
        obj.area(10.5);
    }
}
