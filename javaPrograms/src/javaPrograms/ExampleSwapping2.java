package javaPrograms;

import java.util.Scanner;

public class ExampleSwapping2 {

//	Swapping of two number without using any third variable

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter two number:");
		int a= s1.nextInt();
		int b= s1.nextInt();
		System.out.println("before swapping : " +a +","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping : " +a +","+b);
	}
}
