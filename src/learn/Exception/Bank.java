package learn.Exception;

public class Bank {

	public static void main(String args[]){
		
	}
	public static void withdraw(Account account,double amount)throws InsufficientBalance{
		double currentBalance=account.getBalance();
		if(amount>currentBalance){
		double newBalance =currentBalance - amount;
		account.setBalance(newBalance);
		}
		else{
			throw new InsufficientBalance();
			
		}
	}
	public static void depoist(Account account,double amount){
		double currentBalance=account.getBalance();
		double newBalance =currentBalance + amount;
		account.setBalance(newBalance);
	}
}
