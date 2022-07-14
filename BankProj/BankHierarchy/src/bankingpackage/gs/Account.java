package bankingpackage.gs;

public class Account {
	String accN;
	
	Account(String accN)
	{
		this.accN = accN;
	}
	
	void getAccountInfo()
	{
		System.out.println("Account Name: " + accN);
	}
}
