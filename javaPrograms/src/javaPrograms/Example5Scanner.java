package javaPrograms;

import java.util.Scanner;

public class Example5Scanner {
//         (((((x1+x2)-x3)+x4)*x5)/x5)    - assignment 1 ----26 april---  29 march  
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public int sub(int p, int q)
	{
		int r= p-q;
		return r;
	}
	public int mult(int a1, int b1)
	{
		int c1= a1*b1;
		return c1;
	}
	public void div(int a2, int b2)
	{
		int c2= a2/b2;
		System.out.println("value =" +c2);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value");
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		Example5Scanner obj=new Example5Scanner();
		int result_add= obj.add(x1, x2);
		int result_sub=obj.sub(result_add, x3);
		int result_add2=obj.add(result_sub, x4);
		int result_mult=obj.mult(result_add2, x5);
		obj.div(result_mult, x5);
		
	}
}
