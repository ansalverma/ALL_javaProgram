package javaPrograms;

import java.util.Scanner;

public class ExampleFibonacci {

//	     Fibonacci series
	public static void main(String[] args) {
		int num1=0, num2=1;
		Scanner s= new Scanner(System.in);
		int count=s.nextInt();
		System.out.println("fibonacci series " +count);
		int i=1;
		while(i<=count)
		{
			System.out.println(num1);
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			i++;
		}
	}
}
