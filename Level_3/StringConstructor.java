/*Java Program to use of String Constructor 
Explanation: Constructor is used to initialize an object. Here you need to make two classes as Super and 
Sub class using Inheritance. We initialize two different strings in the constructors of these two classes 
and with the help of the object of Subclass we print these strings.Java Program to Allocate and Initialize
 Super Class Members using Constructor */
package Level_3;

class SuperClass{
    String superString;
    SuperClass(String superString){
        //String name = "Ashwini";
        this.superString = superString;
        System.out.println( "String initialized : " + this.superString);
    }
}

class Subclass extends SuperClass{
    String subString;

 Subclass(String superString , String subString){

    super(superString);
    this.subString = subString;
    
    System.out.println("String initialized : " +this.subString);
 }
}

public class StringConstructor {
    public static void main(String[] args) {
        Subclass obj = new Subclass("In Super Class" , "In subclass");
        obj.hashCode();
        System.out.println("End");
        //obj.ID;
    }
   
}
