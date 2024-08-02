import java.util.*;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();

        System.out.println("Enter month :");
        int mon = sc.nextInt();

        int ans = dayCount(year,mon);
        System.out.println("Number of days in month " + mon + " of year " + year + " is: " + ans);
        sc.close();

    }
    static int dayCount(int year,int month){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(leapYear(year)){
                    return 29;
                }else{
                    return 28;
                }

            default:
                return 0;
        }
        
    }
    static boolean leapYear(int year) {

        if(year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }else{
                return true;
            }
        
        }else{
            return false;
        }
    }
}
