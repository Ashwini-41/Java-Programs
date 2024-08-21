package OOPs_Problem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CompanyShares{
	
	String stockSymbol;
	int NoOfShares;
	Date dateTime;
	public CompanyShares(String stockSymbol, int NoOfShares, Date dateTime) {
		this.stockSymbol = stockSymbol;
		this.NoOfShares = NoOfShares;
		this.dateTime = new Date();
	}
}
public class StockAcc {
	
	private List<CompanyShares> companyShareList;
	
	public StockAcc() {
		companyShareList = new ArrayList<>();
	}
	
	double getShareValue(String symbol) {
		return 100;
	}
	
	double valueOf() {
		double totalValue =0.0;
		
		for(CompanyShares share:companyShareList) {
			totalValue += share.NoOfShares * getShareValue(share.stockSymbol);
		}
		return totalValue;
	}
	
	void buy(int amount, String symbol) {
		
		CompanyShares share = findCompanyShare(symbol);
		
		if(share!=null) {
			share.NoOfShares += amount;
		}else {
			companyShareList.add(new CompanyShares(symbol,amount, new Date()));
		}
		
	}
	
	void sell(int amount, String symbol) {
		
		CompanyShares share = findCompanyShare(symbol);
		
		if(share!=null && share.NoOfShares >=amount) {
			share.NoOfShares -= amount;
		}else {
			System.out.println("Insufficent sell");
		}
	}
	
	CompanyShares findCompanyShare(String symbol) {
		
		for(CompanyShares share :companyShareList) {
			if(share.stockSymbol.equals(symbol)) {
				return share;
			}
		}
		return null;
	}
	
	void save(String filename) {
        System.out.println("Account saved to " + filename);
    }

	
	void printReport() {
		
		System.out.println("Stock Report! ");

		for(CompanyShares share:companyShareList) {
			System.out.println("Share Symbol : "+share.stockSymbol);
			System.out.println("No. of shares : "+share.NoOfShares);
			System.out.println("DateTime : "+share.dateTime);

		}
	}

	public static void main(String[] args) {
		
		StockAcc account = new StockAcc();
		
		account.buy(100, "TATA");
		account.sell(10, "TATA");
		account.buy(200, "SBI");
		
		account.printReport();
		System.out.println("Total Value:  "+account.valueOf());
		account.save("StockData.txt");

	}

}
