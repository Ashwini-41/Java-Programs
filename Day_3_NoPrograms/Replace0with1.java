import java.util.*;
public class Replace0with1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int ans = newNo(number);
        System.out.println("Number with replace : " + ans);
        sc.close();
    }
    static int newNo(int num){
        String str = Integer.toString(num);
        String newStr = str.replace('0', '1');

        int res = Integer.parseInt(newStr);
        return res;
    }
}
