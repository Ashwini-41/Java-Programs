/* Java Program to Illustrates Use of Static Inner Class
Explanation: made an Outer class and define a static Inner class in it. We define a non-static method as
 the show() method in inner class and we try to call this method by inner class object and outer class 
 object and we get the desired output.
 */
package Level_3;
public class Outer{
     static class inner{
        public void show(){
            System.out.println("In static inner class");
        }
    }

    public static void main(String[] args) {
        Outer.inner obj = new Outer.inner();
        obj.show();

    }
}





