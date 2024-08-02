public class SwapNo {
   public static void main(String[] args) {
    int a = 10;
    int b = 20;
    swap(a,b);
    
   } 
   static void swap(int a, int b){
    a = a-b;
    b = a+b;
    a= b-a;
    System.out.println("a is : " + a);
    System.out.println("b is : " + b);
   }
}
