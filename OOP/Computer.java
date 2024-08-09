/*Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," 
and "storage." Include a method to calculate the price of the computer based on the processor, RAM,
 and storage capacity and a method to print the computer's processor, RAM, and storage capacity. */
package OOP;

public class Computer {
    String processor;
    int RAM;
    double storage;

    Computer(String processor,int RAM,double storage){
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }
    private double price(){

        double price;
        if(processor == "Intel core" && RAM == 8 && storage == 512 ){
          price = 70000;
        }else if(processor == "AMD Ryzen" && RAM == 16 && storage == 256){
            price = 150000;

        }else{
            price  = 100000;
        }
        return price;
    }

    private void display(){
        System.out.println("Processor : ");
        System.out.println("RAM : " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Price: "+ price());
    }
    public static void main(String[] args) {
        Computer obj = new Computer("Intel core", 8, 512);
        obj.display();
        
    }
}
