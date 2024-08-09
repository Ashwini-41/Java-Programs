/*Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
 Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, 
 and weight. */
package OOP;

public class Dog {
    String breed;
    int age;
    double weight;
    Dog(String breed,int age,double weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    // private int humanyearAge(){
    //     int humanyear;
    //     if(age <= 2){
    //        humanyear = age * 11;
    //     }else{
    //         humanyear = 22 + (age - 2) * 5;
    //     }
    //     return humanyear;
    // }
    private int humanyearAge(){
        int humanyear = age * 7;
        return humanyear;

    }

    private void display(){
        System.out.println("Breed of dog : "+ breed);
        System.out.println("Age of dog : "+ age);
        System.out.println("Weight is : "+ weight);
        System.out.println("Age in human year is : " + humanyearAge());
    }
    public static void main(String[] args) {
        Dog obj = new Dog("Labrador", 3, 16.4);
        obj.display();
        obj.humanyearAge();
    }
}
