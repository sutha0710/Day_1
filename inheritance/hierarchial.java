package inheritance;
class Head{
	String headoffice="ABC office";
	void display() {
	System.out.println("Hello");
	}
	
}
class chennaiOffice extends Head
{
	void chennai() {
	System.out.println("Head Office"+super.headoffice);
}
}
	class coimbatoreOffice extends Head
	{
		void coimbatore() {
		System.out.println("Head Office"+super.headoffice);
	}
	}

public class hierarchial {

	public static void main(String[] args) {
		chennaiOffice c=new chennaiOffice();
		coimbatoreOffice c1=new coimbatoreOffice();
		c.chennai();
		c1.coimbatore();
	}
		
	}


