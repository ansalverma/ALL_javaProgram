package DoubleLoop;

public class ExampleIncreament {

	public void method() 
	{
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<=i;j++) 
			{
			System.out.print(j+1);
			}
			System.out.println();
		}
	}
	public void number()
	{
		for(int i=1,j=1;i<=4;i++)
		{
			for(int k=0;k<i;j++, k++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ExampleIncreament obj=new ExampleIncreament();
		obj.method();
		obj.number();
	}
}
