package javaPrograms;

public class Example2 {
	// (((((10+2)-2)+2)*2)/2)   ---------- assignment 2  --- 19 april 2020  / 22march
	
	public int add(int a,int b)
	{   
		int c=a+b;
		return c;
	}
	public int sub(int q,int r)
	{
		int p=q-r;
		return p;
	}
	public int mult(int x,int y)
	{
		int z=x*y;
		return z;
	}
	public void div(int a1,int b1)
	{
		int c1=a1/b1;
		System.out.println("result = " +c1);
	}
	public static void main(String[] args) {
		Example2 obj= new Example2();
		int result_add=obj.add(10,2);
		int result_sub=obj.sub(result_add, 2);
		int result_add2=obj.add(result_sub, 2);
		int result_mult=obj.mult(result_add2, 2);
		obj.div(result_mult, 2);
	}
	
}
