package Encapsulation;

public class ReportCardSystem {

	public static void main(String[] args) {
		ReportCard s1=new ReportCard(1001,"Harry",98,86,96);
//		s1.setRollNo(1001);
//		s1.setName("Harry");
//		s1.setM1(98);
//		s1.setM2(56);
//		s1.setM3(86);
		s1.Calc();
		s1.GetDetails();
		System.out.println(s1.getName());
		
	}
}
