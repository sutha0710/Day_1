package Encapsulation;

public class ReportCard {
	private int rollNo;
	private String name;
	private float m1;
	private float m2;
	private float m3;
	private float total;
	private float avg;
	private String grade;
	
	
	public ReportCard(int rollNo, String name, float m1, float m2, float m3) {
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	public float getTotal() {
		return total;
	}
	
	public float getAvg() {
		return avg;
	}
	
	public String getGrade() {
		return grade;
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
