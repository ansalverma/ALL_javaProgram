package javaPrograms;

public class Example5method {
//           assignment 6  sequence for method ----- 26 april ---- 29-Mar-20

	public void method1()
	{
		System.out.println("Default method");
	}
	public void method1(int a)
	{
		System.out.println("one param method");
	}
	public void method1(int a, int b)
	{
		System.out.println("two param method");
		
	}
	public void method1(int a, int b, int c)
	{
		System.out.println("three param method");
	}
	public void method1(int a, int b, int c,int d)
	{
		System.out.println("four param method");
		this.method1();
		this.method1(2);
		this.method1(2,3,4);
		this.method1(1,2);	
	}
	public static void main(String[] args) {
		Example5method obj= new Example5method();
		obj.method1(2, 2,2,2);
	}
}
