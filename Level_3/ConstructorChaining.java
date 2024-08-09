/*8. Java Program to use of Constructor Chaining:(Read about this first)
 */
package Level_3;

public class ConstructorChaining {
    ConstructorChaining(){
        this(10); 
        System.out.println("In default constructor");
        
    }
    ConstructorChaining(int x){
        
        System.out.println("In parameterized constructor x is : " + x);

    }

    ConstructorChaining(int x, int y){
        this();
        int add = x + y;
        System.out.println("Addition of " + x + " and " + y  + " is "+ add);
    }
    
   
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining(20,30);
        
        
    }
}
