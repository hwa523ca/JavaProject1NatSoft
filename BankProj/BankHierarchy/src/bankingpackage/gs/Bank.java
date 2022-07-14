package bankingpackage.gs;

class Bank {

	int custID;
	String custName;
	
	Bank(int custID, String custName)
	{
		this.custID = custID;
		this.custName = custName;
	}
	
	float getFDRateOfInterest()
	{
		return 2.25f;
	}
	
	float getRDRateOfInterest()
	{
		return 4.00f;
	}
	
	public static void main(String[] args) {
		Bank b = new Bank(101, "Henry");
		System.out.println("Customer ID: " + b.custID + "\nCustomer Name: " + b.custName + "\nFixed Interest Rate: " + b.getFDRateOfInterest() + "%\nRecurring Interest Rate: " + b.getRDRateOfInterest() + "%\n");
		Account theAcc1 = new Account("Henry's HDFC Bank Account");
		Account theAcc2 = new Account("Henry's Kotak Bank Account");
		Account theAcc3 = new Account("Henry's IDBI Bank Account");
//		theAcc.getAccountInfo();
		HDFCBank hdfc = new HDFCBank(10101, "Henry Anderson", theAcc1);
		hdfc.HDFCSpecialProperty();
		KotakBank kotak = new KotakBank(20101, "Henry Anderson", theAcc2);
		kotak.KotakSpecialProperty();
		IDBIBank idbi = new IDBIBank(30101, "Henry Anderson", theAcc3);
		idbi.IDBISpecialProperty();
	}

}
