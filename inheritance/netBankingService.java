package inheritance;

public class netBankingService extends PaymentService{
	void payWithNetBanking(long customerId,long mobile){
		{
			super.sendOTP(mobile);
			System.out.println("Purchased with Netbanking"+customerId);
	}
		
	}
	

}
