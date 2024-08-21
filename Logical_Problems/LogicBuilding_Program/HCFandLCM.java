/*
 * HCF and LCM Calculator: Write a program to find the Highest Common Factor (HCF)
and Least Common Multiple (LCM) of two given numbers. in j
 */
package Logical_Problems.LogicBuilding_Program;

public class HCFandLCM {

    static int calculateHCF(int a, int b){

        while(b != 0){
            int temp = b;
            b = b % a;
            a = temp;
        }
        return a;
    }

    static int calculateLCM(int a, int b){

        return (a * b ) / calculateHCF(a, b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        //System.out.println("hello");

        int hcf = calculateHCF(a,b);
        int lcm = calculateLCM(a,b);

        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);

    }
}
