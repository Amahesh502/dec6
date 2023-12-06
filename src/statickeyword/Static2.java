package statickeyword;

public class Static2 {
	public static void main(String[] args) {
		System.out.println(Static.a);
		Static.method1();
		
		Static s = new Static();
		
		System.out.println(s.b);
		s.method();
	}
	
}
/* static method
 * if we want to access static variables and static methods, 
 * which are present in other class use with classname.variable name.
 */

