package javaPrograms;

public class Example4Constructor {
//          Assignment Constructor sequence by this keyword      25 april-   28-Mar-20

	public Example4Constructor()
	{
		this(1,2,3,4);
	System.out.println("Default constructor");
	}
	public Example4Constructor(int a)
	{
		this(1,2);
		System.out.println("one param constructor");
	}
	public Example4Constructor(int a,int b)
	{
		this();
		System.out.println("two param constructor");
	}
	public Example4Constructor(int a,int b,int c)
	{
		this(1);
		System.out.println("three param constructor");
	}
	public Example4Constructor(int a,int b,int c,int d)
	{
		System.out.println("four param constructor");
	}
	public static void main(String[] args) {
		Example4Constructor obj=new Example4Constructor(1,2,3);
		
	}
}
