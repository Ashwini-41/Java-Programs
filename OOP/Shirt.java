/*
 * Write a Java program to create a class called "Shirt" with instance variables "size," "color," 
 * and "price." Include a method to calculate the discount on the shirt with instance variables "size," 
 * "color," and "price." Include a method to calculate the discount on the shirt based on  its size and a 
 * method to print the shirt's size, color, and discounted price
 */
package OOP;

public class Shirt {
    int size;
    String color;
    double price;

    Shirt(int size,String color,double price){
        this.size = size;
        this.color = color;
        this.price = price;
    }

    private double discount(){
        double dis;
        if(size <= 30){
            dis = 0.05;
        }else if(size <= 46){
            dis = 0.10;

        }else{
            dis = 0.15;
        }
        return price *dis;
    }

    private void display(){
        double dis = discount();
        double discountedPrice = price - dis;

        System.out.println("Size: " + size);
        System.out.println("Color: "+ color);
        System.out.println("Price: "+ price);
        System.out.println("Discount: "+ dis);
        System.out.println("Discounted Price: "+ discountedPrice);
    }

    public static void main(String[] args) {
        Shirt sh = new Shirt(42, "Black", 2500);
        sh.display();
    }
}
