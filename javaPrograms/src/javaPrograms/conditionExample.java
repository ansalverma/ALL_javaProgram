package javaPrograms;

import java.util.Scanner;

public class conditionExample {

	public void method()
	{
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("even number");
		}
	}
	public static void main(String[] args) {
		conditionExample con= new conditionExample();
		con.method();
	}
}
