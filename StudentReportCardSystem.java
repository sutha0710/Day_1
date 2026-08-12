package PROGRAMS;
class StudentReportCard{
	int rollNo;
	String name;
	float m1;
	float m2;
	float m3;
	float total;
	float avg;
	String grade;
	StudentReportCard(int rollNo,String name,float m1,float m2,float m3)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		Calc();
	
	}
	void Calc() {
		total=m1+m2+m3;
		avg=total/3;
		if(avg>90)
		{
			grade="A";
		}
		else if(avg>70)
		{
			grade="B";
		}
		else if(avg>60)
		{
			grade="C";
		}
		else if(avg>40)
		{
			grade="D";
		}
		else {
			grade="E";
		}
	}
	void GetDetails() {
		
		System.out.println("Roll no:"+rollNo+"\nName:"+name+"\nTamil:"+m1+"\nEnglish:"+m2+"\nMaths:"+m3+"\nTotal:"+total+"\nAverage:"+avg+"\nGrade:"+this.grade);
	}	
}
public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1=new StudentReportCard(18,"Harry",98,85,96);
		s1.grade="A++";
		s1.GetDetails();
		
		
		StudentReportCard s2=new StudentReportCard(38,"Ron",68,78,86);
		s2.GetDetails();

	}

}
