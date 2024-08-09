/*
 2. Java Program to Count Number of Objects Created for ClassExplanation:Whenever an object is made of a 
 class, its constructor is invoked. Whenever the constructor runs we increment the counter value.
  Hence the number of objects created of a class equals the counter value.
 */
package Level_2;

public class ObjectCount {
    static int count = 0;

    ObjectCount(){
        count++;
    }
    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();

        ObjectCount obj3 = new ObjectCount();

        ObjectCount obj4 = new ObjectCount();

        System.out.println("Count of object is: " + count);

        
    }
}
