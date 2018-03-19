package learn.Exception;

public class AccountTest {

	public static void main(String[] args) {
		Account account1= new Account(1001,6779);

		Account account2= new Account(1002,4323);

		System.out.println(account1.getBalance());

		System.out.println(account2.getBalance());
		try{
		Bank.withdraw(account1, 1000);
		}
		catch(InsufficientBalance e)
		{
			
				}
		try{
			Bank.withdraw(account2, 1000);
			}
			catch(InsufficientBalance e)
			{
				
					}
			
		System.out.println(account1.getBalance());

		System.out.println(account2.getBalance());
		
	}

}
