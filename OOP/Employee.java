package OOP;

public class Employee {
    String name;
    float salary;
    int id;

    public Employee(String name,float salary,int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        System.out.println("Id: " + id);
    }
    public float calculateSal(){
        return salary = salary + salary * 12;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Shree", 3000, 100);
        emp.display();
        System.out.println("salary of a year is : "+ emp.calculateSal());

    }

}
