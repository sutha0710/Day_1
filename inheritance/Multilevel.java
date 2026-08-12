package inheritance;
class A{
	int num1;
	int add(int a,int b)
	{
		return a+b;
	}
	
}
class B extends A{
	int num2;
	int mul(int a,int b)
	{
		return a*b;
	}
}
class C extends B{
	void calc() {
	super.num1=8;
	super.num2=4;
	System.out.println("Addition:"+super.add(num1,num2));
	System.out.println("Multiplicatin:"+super.mul(num1,num2));
	}
}

public class Multilevel {

	public static void main(String[] args) {
		C c=new C();
		c.calc();//we cannot create object for B because we cannot access class C
	}

}
