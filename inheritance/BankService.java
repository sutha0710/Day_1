package inheritance;

public class BankService {
	void deposit(long accountNo,float amount)
	{
		System.out.println("Amount "+amount +" deposited to "+ accountNo);
	}
 void withdraw(long accountNo,float amount)
	{
		System.out.println("Amount "+amount +" Withdraw from "+ accountNo);
	}
	void printreceipt()
	{
		System.out.println("Account Number");
		System.out.println("Account holder");
	}



		

	

}
