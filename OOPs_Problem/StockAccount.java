/*
 * 1. Stock Account Management
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
from the input file. Have functions in the Class to calculate the value of each
stock and the value of total stocks.
 */
package OOPs_Problem;
import java.util.*;



class StockPortfolio{
    private List<StockAccount> stocks;

    public StockPortfolio(){
        stocks = new ArrayList<>();
    }

    public void addStock(StockAccount stock){
        stocks.add(stock);
    }

    public double calculateTotalValue(){
        double totalValue = 0;
        for(StockAccount stock : stocks){
            totalValue = totalValue + stock.calculateValue();
        }

        return totalValue;
    }

    public void displayPortfolio(){
        System.out.println("Stock Report");
        for(StockAccount stock : stocks){
            stock.displayStock();
        }
        System.out.printf("Total Value of Portfolio is: %.2fn",calculateTotalValue() );
    }
}

public class StockAccount {
    
    private String name;
    private int numOfShares;
    private double sharePrice;
    public StockAccount(String name, int numOfShares,double sharePrice){
         this.name = name;
         this.numOfShares = numOfShares;
         this.sharePrice = sharePrice; 
    }

    public double calculateValue(){
        return numOfShares * sharePrice;
    }
    public void displayStock(){
        System.out.printf("Stock: %s, Shares: %d, Share Price: %.2f , Stock Value: %.2f%n",name,numOfShares,sharePrice,calculateValue());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of stock : ");
        int no_of_stock = sc.nextInt();
        StockPortfolio portfolio = new StockPortfolio();


        // StockAccount stock = new StockAccount(stockname, numOfShares, sharePrice);


       // System.out.print("Enter Name");

       for(int i=1;i<=no_of_stock;i++){
        System.out.println("Enter Details for stock : " + i);

        System.out.println("Enter stock name: ");
        String stockname = sc.next();

        System.out.println("Enter number of shares : ");
        int numOfShares = sc.nextInt();

        System.out.print("Enter share price : ");
        double sharePrice = sc.nextDouble();

        
        StockAccount stock = new StockAccount(stockname, numOfShares, sharePrice);
        stock.displayStock();
        portfolio.addStock(stock);

       }
       
       portfolio.displayPortfolio();
        sc.close();
    }

}
