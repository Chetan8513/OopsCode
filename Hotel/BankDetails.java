package Hotel;

public class BankDetails {
	
	final static String BANK_NAME = "CentralBank";
	String Name;
	String LastName;
	int BankNumber;
	String Ifsc;
	static int NoOfAccounts;
	
	public BankDetails() {
		
	}
	
	//parametarized construtor
	
	public BankDetails(String Name , String LastName ,int BankNumber) {
		
		this.Name = Name;
		this.LastName = LastName;
		this.BankNumber = BankNumber;
		NoOfAccounts++;
		BankNumber = NoOfAccounts;
		
			if(Name.isEmpty()) {
			System.out.println("its should not be empty");
		}else if(LastName.isEmpty()) {
			System.out.println("ists should not be empty");
		}else
			System.out.println("result is");
	
		
	if(BankNumber <10) {
		throw new IllegalArgumentException("Amount should not be less than 10");
		//System.out.println("value should be graater");
	}else {
		this.BankNumber = BankNumber;
		
	}
	}
	

	@Override
	public String toString() {
		return "BankDetails [Name=" + Name + ", LastName=" + LastName + ", BankNumber=" + BankNumber + "]";
	}
	
	

}
