package statickeyword;

public class Swap2Str {
	public static void main(String[] args) {
		String s1 = "mahesh";
		String s2 = "nellore";
		System.out.println("Before swapping :");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		s1 = s1 + s2;//maheshnellore
		s2 = s1.substring(0,s1.length() - s2.length());//mahesh
		s1 = s1.substring(s2.length());
		System.out.println();
		System.out.println("After swapping : ");
		System.out.println("s1 = "+ s1);
		System.out.println("s2 = "+ s2);
	}
}
