/*
 Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
returned by Vending Machine. Write a Program to calculate the minimum number
of Notes as well as the Notes to be returned by the Vending Machine as a
Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
to get to the minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
change and second list of Rs Notes that would given in the Change
 */
package Logical_Programs;
import java.util.*;
public class VengingMachine {

    static final int[] Notes = {1000,500,100,50,10,5,2,1};
    static void changeCalculate(int amount, List<Integer> result){

        for(int note : Notes){
            if(amount>=note){
                result.add(note);
                changeCalculate(amount - note, result);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        changeCalculate(amount,result);
        System.out.println("The total number of notes needed : "+ result.size());
        System.out.println("Notes to be returned: " + result);
        sc.close();
    }
}
