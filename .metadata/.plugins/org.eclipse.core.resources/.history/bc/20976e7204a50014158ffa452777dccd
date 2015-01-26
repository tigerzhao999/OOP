
public class BankAccount {
	//constructors
	private double balance;
	
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(double initalBalance){
		balance = initalBalance;
	}
//methods 	
	//put in money to bank account
	public void deposit (double amount ){
		double newBalance = balance + amount;
		balance = newBalance;
	}
	//take out money from bank acccount
	public double widthdraw (double amount ){
		if (amount > balance) {
			System.out.println("FUGGEDDABOUDDIT");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}
	public void showBalance() {   // does not return money, just prints balance
		System.out.println(balance);
	}
	
}

