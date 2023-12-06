package statickeyword;

public class Student {
	int sid;
	String name;
	char grade;
	
	Student() 
	{
		sid = 510;
		name = "mahi";
		grade = 'A';
	}
	
	
	
	
	
//	void show()
//	{
//		System.out.println(sid);
//		System.out.println(name);
//		System.out.println(grade);
//	}
	
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", name=" + name + ", grade=" + grade + "]";
//	}


	public static void main(String[] args) {
		Student s = new Student();
//		s.sid = 502;
//		s.name = "mahesh";
//		s.grade = 'A';
//		s.show();
		System.out.println(s);
//		s.show();
	}

}
