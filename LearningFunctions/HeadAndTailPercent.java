/*Flip Coin and print percentage of Heads and Tails */
import java.util.Random;
import java.util.Scanner;

public class HeadAndTailPercent {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of time coin flip : ");
        int nf = sc.nextInt();

        percentageOfHT(nf);
        sc.close();
    }
    static void percentageOfHT(int nf){
        Random random = new Random();
        int headCount = 0;
        int tailCount = 0;
        for(int i=0;i<nf;i++){
            if(random.nextDouble() < 0.5){
               tailCount++;
            }else{
                headCount++;
            }
        }
        double tailpercentage = ((double)tailCount / nf)*100;
        double headpercentage = ((double)headCount/nf)*100;
        System.out.println("Total number of head : "+ tailCount);
        System.out.println("Total number of head : "+ headCount);
        System.out.println("Percentage of Tail is : " + tailpercentage);
        System.out.println("Percentage of Head is : " + headpercentage);

    
    }
}
