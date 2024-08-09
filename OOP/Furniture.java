/*
 * Write a Java program to create a class called "Furniture" with instance variables "type," "material,"
 *  and "price." Include a method to calculate the discount on the furniture 
 * based on its material and a method to print the furniture's type, material, and discounted price.
 */
package OOP;

public class Furniture {
    String type;
    String material;
    double price;

    Furniture(String type,String material,double price){
        this.type = type;
        this.material = material;
        this.price = price;
    }

    private double discount(){

        double discountP;
        switch (material) {
            case "wood":
                discountP = 0.10;
                
                break;
            case "Metal":
                discountP = 0.15;
                break;
            case "Plastic":
                 discountP = 0.05;
                 break;
            default:
                 discountP = 0.0;
                break;
        }
        
        return price*discountP;
    }
    private void display(){
        double dis = discount();
        double discountedPrice = price - dis;
        System.out.println("Type: "+ type);
        System.out.println("Material: "+ material);
        System.out.println("Price: "+ price);
        System.out.println("Discount : "+ dis);
        System.out.println("Discounted Price : "+ discountedPrice);

    }

    public static void main(String[] args) {
        Furniture f = new Furniture("Table", "wood", 20000);
        f.display();
    }
}
