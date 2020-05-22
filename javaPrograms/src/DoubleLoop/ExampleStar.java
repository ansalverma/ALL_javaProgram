package DoubleLoop;

public class ExampleStar {
//     not working properly-- reverse triangle
		public void method2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ExampleStar obj1=new ExampleStar();
		obj1.method2();
	}
}
