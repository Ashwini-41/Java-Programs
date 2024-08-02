/*
 Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
 */
package Logical_Programs;
import java.util.*;
public class CouponNo {
    
    static int randomCoupen(int n){
        Random random = new Random();

        return random.nextInt(n);
    }

    static int randomNumGen(int n){
        //int numberGen = randomNumber();
        int randomNumGenerated = 0;
        Set<Integer> hs = new HashSet<>();
        while (hs.size() < n) {
            int newCoupon = randomCoupen(n);
            randomNumGenerated++;
            hs.add(newCoupon);
        }
        return randomNumGenerated;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int randomNo = randomNumGen(n);
        System.out.println("Total distinct random numbers : " + randomNo);
        sc.close();

    }
}
