package statickeyword;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of rows : ");
		int rows = sc.nextInt();
		for(int i = 1; i <= rows; i++)
		{
			int temp = rows;
			for(int j = 1; j <= rows-i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i*2-1; j++)
			{
				if(j >= i)
				System.out.print(temp--+" ");
				else
					System.out.print(rows-(i-j)+" ");
			}
			System.out.println();
		}
	}
}
