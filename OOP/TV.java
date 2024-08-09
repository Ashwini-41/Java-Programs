/*Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price." 
Include a method to calculate the discount on the TV based on its size and a method to print the TV's 
brand, size, and discounted price. */
package OOP;

public class TV {
    String brand;
    double size;
    double price;

    TV(String brand,double size,double price){
        this.brand = brand;
        this.size= size;
        this.price = price;
    }
    private double discount(){
        double dis;
        if(size <= 30){
          dis = 0.05;
        }else if(size <=20){
            dis = 0.10;
        }else{
            dis = 0.15;
        }
        return price *dis;
    }
    private void display(){
        double dis = discount();
        double discountedPrice =  price - dis;
        System.out.println("Brand : "+ brand);
        System.out.println("Size: " + size);
        System.out.println("Price: "+ price);
        System.out.println("Discount : " + dis);
        System.out.println("Discounted Price : "+ discountedPrice);
    }

    public static void main(String[] args) {
        TV tv = new TV("MI", 60, 30000);
        tv.display();
    }
}
