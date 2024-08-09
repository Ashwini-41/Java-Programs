package OOP;

public class Addition {
   static int num1 = 20;
   static int num2 = 30;

    public void add(int num1,int num2){
        int c = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + c);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(num1,num2);
    }

}
