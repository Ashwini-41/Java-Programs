import java.util.*;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        String binary = sc.nextLine();

        String octal = inOctal(binary);
        System.out.println("Binary number in octal form is : " + octal);

      sc.close();
    }
    static String inOctal(String binary){
        int decimal = Integer.parseInt(binary , 2);
        String octal = Integer.toOctalString(decimal);
       // String hex = Integer.toBinaryString(decimal);
        //System.out.println("Binary" + hex);

        return octal;
    }
}
