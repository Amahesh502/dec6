package statickeyword;

public class Thiskeyword {
	
	int i;
	int j;
	String name;
	Thiskeyword(int i, int j, String name) 
	{
		this.i = i;
		this.j = j;
		name = name;
	}
	
	void display()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
			Thiskeyword tk = new Thiskeyword(1, 20,"mahesh");
			tk.display();
	}
	
	
	
}
