package DoubleLoop;

public class ExampleTrianle {

	public void triangle()
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
	}
	public void triangle1()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ExampleTrianle obj=new ExampleTrianle();
		obj.triangle();
		obj.triangle1();
		
	}
}
