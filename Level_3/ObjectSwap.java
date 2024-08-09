/*Java Program to Swap Objects using Swap() Method
Explanation: Make a swap method to interchange the information of two employees using Employee Objects by 
passing them to swap() method. */
package Level_3;
//import java.util.*;
class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void display(){
        System.out.println("Employee name: " + name + " Employee ID: " + id);
        //System.out.println("Employee ID: " + id);

        
    }
    public static void swap(Employee emp1,Employee emp2){
       //System.out.println("Swap inter");
       String tempname = emp1.name;
       emp1.name = emp2.name;
       emp2.name = tempname;

       int tempId = emp1.id;
       emp1.id = emp2.id;
       emp2.id = tempId;
    }
}

public class ObjectSwap {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ashwini", 100);
        Employee emp2 = new Employee("Tejii", 102);

        System.out.println("Before Swap:");
        emp1.display();
        emp2.display();

        Employee.swap(emp1,emp2);
        System.out.println("After Swap:");
        emp1.display();
        emp2.display();

        //obj.swap();

    }
    
}
