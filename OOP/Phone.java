/*Write a Java program to create a class called "Phone" with instance variables "make," "model," and 
"storage." Include a method to calculate the price of the phone based on the make, model, and storage 
capacity and a method to print the phone's make, model, and storage capacity.
 */
package OOP;

public class Phone {
    private String make;
    private String model;
    private int storage;


    Phone(String make,String model,int storage){
        this.make = make;
        this.model = model;
        this.storage = storage;
    }
    private void price(){
        int price;
        if(model == "S-23" && make == "Samsung" && storage == 256){
             price = 50000;
             System.out.println("Price : "+price);
        }else if(model=="15-pro" && make == "Apple" && storage == 256){
            price = 150000;
            System.out.println("Price: " + price);
        }
    }
    private void display(){
        System.out.println("Make: "+ make);
        System.out.println("Model: " + model);
        System.out.println("Storage: "+storage);
    }
    public static void main(String[] args) {
        Phone obj = new Phone("Samsung", "S-23", 256);
        Phone obj1 = new Phone("Apple", "15-pro", 256);


        obj.display();
        obj.price();
        obj1.display();
        obj1.price();
    }
}
