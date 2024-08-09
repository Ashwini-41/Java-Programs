/* Java Program to Create a class Bank Account and the Inner Class Interest in it
Explanation We declare the Outer class as BankAcct and the inner class as Interest. Now we use the variables 
declared in the outer class to get the output in the inner class. */
package Level_3;

public class BanckAccount {
    private double principle;
    private double rate;
    private int time;

    BanckAccount(double principle,double rate,int time){
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }

    
    class Interest{
      public void calSimpleInterest(){
        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest is : " + simpleInterest);
      }

      public void calculateCompoundInterest(){
        double compoundInterest = principle * Math.pow((1+rate/100), time) - principle;
        //principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Compound Interest: " + compoundInterest);
      }
        
        
    }

    public static void main(String[] args) {
        BanckAccount bank = new BanckAccount(10000, 5, 2);

        BanckAccount.Interest interest = bank.new Interest();
        interest.calSimpleInterest();
        interest.calculateCompoundInterest();

    }
}
