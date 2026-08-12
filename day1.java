package PROGRAMS;
import java.util.*;

public class day1 {
	public static boolean isPalindrome(int n)
	{
		int rev=0;
		int t=n;
		while(n>0)
		{
			int digit=n%10;
			 rev =rev*10+digit;
			n=n/10;
		}
		return t==rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isPalindrome(n)) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
