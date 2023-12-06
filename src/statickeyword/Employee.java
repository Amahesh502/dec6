package statickeyword;

public class Employee {
	
			long 	id;//instance variable
			String 	name;//instance variable
	static	int		deptNo = 10;//static variable
	
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(deptNo);
	}
	
	public static void main(String[] args) {//static method
		
		Employee e = new Employee();
		e.id = 1;
		e.name="anil";
		e.show();
		
		e.id = 2;
		e.name = "mahesh";
		e.show();
	}
}
