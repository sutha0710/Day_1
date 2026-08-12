package inheritance;
import java.util.*;
public class hierarchialInheritanceExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Credit card");
		System.out.println("2.Net Banking");
		int choose=sc.nextInt();
		switch(choose)
		{
		case 1:
		{
			creditCardService c=new creditCardService();
			c.payWithCreditCard(3456789,2345);
			break;
			
		}
		case 2:
		{
			netBankingService n=new netBankingService();
			n.payWithNetBanking(34567,456789678);
			break;
		}
			
		}
		
		
		
	}

}
