package inheritance;

public class BankService2 extends BankService {
	void updateAccountDetails() {
		System.out.println("Account details updated....");
	}
	void updateAadharNumber() {
		System.out.println("Aadhaar NO upadated....");
	}
	void applyForPersonalLoan(long accNo,float loanAmount,int tenure)
	{
		System.out.println("Your Loan application is Processing");
	}

	

}
