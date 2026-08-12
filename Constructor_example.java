package PROGRAMS;
class Employees{
	int empId;
	String empName;
	char gender;
	Employees(){
		System.out.println("Object created");
		
	}
	Employees(int empId,String empName,char gender)
	{
		this.empId=empId;
		this.empName=empName;
		this.gender=gender;
	}
	void GetDetails() {
		System.out.println("Id:"+this.empId  +"Name:"+this.empName   +"Gender:"+this.gender);
	}
	
}
public class Constructor_example {

	public static void main(String[] args) {
		Employees e1=new Employees(1,"Harry",'M');
		//System.out.println("Id:"+e1.empId +"Name:"+e1.empName +"Gender:"+e1.gender);
		e1.GetDetails();
		Employees e2=new Employees();
		e2.GetDetails();

	}

}

