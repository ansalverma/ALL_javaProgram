package javaPrograms;

public class Example3 {
//         ((((10/2)-2)+2)+2)*2)    ---- assignment part2  -- 19 april 2020  / 22 march

	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public void mult(int a,int b)
	{
		int c=a*b;
		System.out.println("result =" +c);
	}
	public static void main(String[] args) {
		Example3 obj=new Example3();
		int result_div=obj.div(10, 2);
		int result_sub=obj.sub(result_div, 2);
		int result_add=obj.add(result_sub, 2);
		int result_add2=obj.add(result_add, 2);
		obj.mult(result_add2, 2);
		
	}
}
