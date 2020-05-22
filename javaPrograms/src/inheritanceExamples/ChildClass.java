package inheritanceExamples;

public class ChildClass extends ParentClass{

	public ChildClass()
	{
		System.out.println("Default child constructor");
	}
	public ChildClass(int a)
	{
		System.out.println("One param child constructor");
	}
	public ChildClass(int a,int b)
	{
		System.out.println("Two param child constructor");
	}
	public ChildClass(int a,int b,int c)
	{
		System.out.println("Three param child constructor");
	}
	public ChildClass(int a,int b,int c,int d)
	{
		System.out.println("Four param child constructor");
	}
	public static void main(String[] args) {
		
	}
}
