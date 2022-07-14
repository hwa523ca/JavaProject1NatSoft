package bankingpackage.gs;

public class IDBIBank extends Bank {
	
	Account acc;
	
	IDBIBank(int custID, String custName, Account acc)
	{
		super(custID, custName);
		this.acc = acc;
	}
	
	float getFDRateOfInterest()
	{
		return 2.7f;
	}
	
	float getRDRateOfInterest()
	{
		return 7.00f;
	}
	
	void IDBISpecialProperty()
	{
		System.out.println("Customer ID: " + custID + "\nCustomer Name: " + custName);
		acc.getAccountInfo();
		System.out.println("Fixed Interst Rate: " + getFDRateOfInterest() + "%\nRecurring Interest Rate: " + getRDRateOfInterest() + "%\n");
	}
}
