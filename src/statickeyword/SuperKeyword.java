package statickeyword;

class Base
{
	int i = 10;
	void m1()
	{
		System.out.println("base");
	}
}

class Derived extends Base
{
	int j = 50;
	void m1()
	{
		super.m1();
		System.out.println(super.i);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.m1();
		
	}
}
