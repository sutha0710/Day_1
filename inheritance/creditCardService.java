package inheritance;

public class creditCardService extends PaymentService {
	void payWithCreditCard(long mobile,long cardNo) {
		super.sendOTP(mobile);
		System.out.println("Purchased with Credit Card"+cardNo);
	}
	

}
