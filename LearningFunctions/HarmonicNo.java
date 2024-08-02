/* */
import java.util.*;
public class HarmonicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        double harmonic = 0.0;
        if(n==0){
            System.out.println("0");
        }
        for(int i=1;i<=n;i++){
            harmonic = harmonic + 1.0/i;
        }
        System.out.println("Harmonic value upto " + n + " is " + harmonic);
        sc.close();

    }
}
