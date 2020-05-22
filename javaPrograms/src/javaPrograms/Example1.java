package javaPrograms;

public class Example1 {
//     assignment of 18 april 2020-------  assignment 1  ----- 21 march
	int age;
	int roll_no;
	
	public void method1()
	{
		System.out.println("welcome to all of you");
	}
	public void method2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) {
		Example1 obj=new Example1();
		obj.age= 12;
		System.out.println(obj.age);
		obj.roll_no=23;
		System.out.println(obj.roll_no);
		obj.method1();
		obj.method2();
		
	}
}
