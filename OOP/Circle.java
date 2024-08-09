/*Write a Java program to create a class called "Circle" with an instance variable "radius." Include
 a method to calculate the area of the circle and a method to calculate the circumference of the circle. */
package OOP;

public class Circle {
    int radius = 10;
    private void area(int r){
     double areaOfcircle = Math.PI * Math.pow(r, 2);
     //System.out.println("Area of circle is : " + areaOfcircle);
    System.out.printf("Area of circle is : %.2f%n ",areaOfcircle);
    }

    private void circumference(int r){
        double circumferenceOfCircle = 2 * Math.PI * r;
        System.out.printf("Cicumference of circle is : %.2f%n " , circumferenceOfCircle);

    }
    
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area(obj.radius);
        obj.circumference(obj.radius);
    }
}
