package PROGRAMS;
class Student{
	int rollNo;
	String name;
	int grade;
	char section;
	void SetValues(int rollNo, String name,int grade,char section)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.grade=grade;
		this.section=section;
	}
}

public class SchoolSystem {

	public static void main(String[] args) {
		Student s1=new Student();
		/*s1.rollNo=18;
		s1.name="Peter";
		s1.grade=12;
		s1.section='B';
		*/
		s1.SetValues(18,"Peter",12,'B');
		System.out.println("Roll No:"+s1.rollNo+"\nName:"+s1.name+"\nGrade:"+s1.grade+"\nSection:"+s1.section);
		

	}

}
