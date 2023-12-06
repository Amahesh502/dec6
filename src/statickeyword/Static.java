package statickeyword;

public class Static {
	
	static int a = 10;//static variable 
		   int b = 20;//non-static variable
		   
	void method()//non-static method
	{
		System.out.println("non-static method");
	}
	
	
	static void method1()
	{
		System.out.println("static method");
	}
	
//	public static void main(String[] args) {
//		method1();
//		
//		Static s = new Static();
//		
//		System.out.println(s.b);
//		s.method();
//	}
//	
     
}