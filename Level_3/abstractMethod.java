/*1. Java Program to create a calculator and apply all  features of Abstract class
Explanation:Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods in parent class
 which are defined in child class and we can call all these methods via making object of child class.as abstract 
 methods in parent class which are defined in child class and we can call all these methods via making object
  of child class.
 */
package Level_3;
abstract class Calculator{

    abstract void add(int a,int b);
    abstract void multiply(int a, int b);
    abstract void Subtract(int a , int b);
    abstract void divide(int a, int b);

}
class Child extends Calculator{
   

    void add(int a, int b){
        int add = a+b;
        System.out.println("Addition is: " + add);
    }
    void multiply(int a , int b){
        System.out.println("Multiplication is: " + a * b);
    }
    void Subtract(int a , int b){
        int sub = a - b;
        System.out.println("Substraction is : " + sub);
    }

    void divide(int a,int b){
        double div = a / b;
        System.out.println("Division is: " + div);
    }

}
public class abstractMethod {
    public static void main(String[] args) {
        Calculator obj = new Child();
        obj.add(20, 30);
        obj.divide(50,10 );
        obj.Subtract(50, 25);
        obj.multiply(20, 5);
    }

}
