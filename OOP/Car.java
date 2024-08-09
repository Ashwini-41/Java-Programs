package OOP;

public class Car {
    private String make;
    private String model;
    private String year;
 Car(String make, String model, String year){
    this.make = make;
    this.model = model;
    this.year = year;

 }

 public void display(){
    System.out.println("Make: " + make);
    System.out.println("Model: "+ model);
    System.out.println("Year: " + year);
 }
    
    public static void main(String[] args) {
        Car obj = new Car("Toyota","Corola","2000");
        Car obj1 = new Car("Tata", "Nexon", "2020");

        obj.display();
        obj1.display();

    }
}
