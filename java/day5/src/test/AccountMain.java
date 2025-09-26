package test;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setAccountNumber(1234556);
		account.setOwner("손효정");
		account.setBalance(100000);
		
		System.out.println(account.toString());

	}

}
