package DoubleLoop;

public class ExamplePyramid {

	public void method2()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		ExamplePyramid obj=new ExamplePyramid();
	
		obj.method2();
	}
}
