// package LearningFunctions;

import java.util.Scanner;

public class FactorialNum {
static Scanner sc = new Scanner(System.in);
static int number; // Static Keyword
public static void main(String[] args) {


userInput();
int result=factorialOfNumber(number);
display(result);

}
// Normal Function
private static void userInput() {
System.out.print("Enter N :");
number = sc.nextInt();

}

// Function with Parameter
private static void display(int result) {
System.out.println("Fatorial is : " + result);
}

// Function with Parameter and with return type.
private static int factorialOfNumber(int n) {
//int temp = n;
int fact =1;
if(n == 0|| n==1){
    return 1;
}

//using while loop
// while(temp!=0){
// fact = fact*temp;
// temp--;
// }

//using for loop
for(int i=1;i<=n;i++){
    fact = fact * i;
}
return fact;

// System.out.println("Factorial of number "+n +" is "+fact);
// sc.close();

}

}