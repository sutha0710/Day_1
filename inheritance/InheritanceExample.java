package inheritance;
class Parent{
	int a,b;
	void display() {
		System.out.println("Hello from Parent Class");
	}
}
class Child extends Parent{
	//1.Memory consumption 2.Code reusability
	void calc()
	{
		super.a=10;
		super.b=20;
		int c=super.a+super.b;
		System.out.println("Addition:"+c);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
	
	Child obj1=new Child();
	obj1.display();
	obj1.calc();

	}

}
