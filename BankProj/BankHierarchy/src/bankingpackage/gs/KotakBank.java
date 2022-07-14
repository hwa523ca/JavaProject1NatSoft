package bankingpackage.gs;

class KotakBank extends Bank{
	
	Account acc;
	
	KotakBank(int custID, String custName, Account acc)
	{
		super(custID, custName);
		this.acc = acc;
	}
	
	float getFDRateOfInterest()
	{
		return 2.50f;
	}
	
	float getRDRateOfInterest()
	{
		return 4.30f;
	}
	
	void KotakSpecialProperty()
	{
		System.out.println("Customer ID: " + custID + "\nCustomer Name: " + custName);
		acc.getAccountInfo();
		System.out.println("Fixed Interst Rate: " + getFDRateOfInterest() + "%\nRecurring Interest Rate: " + getRDRateOfInterest() + "%\n");
	}
}
