package learn.Exception;

public class Account {

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private int accountId;
	public Account(int accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	private double balance;
}
