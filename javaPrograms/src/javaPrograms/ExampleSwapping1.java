package javaPrograms;

import java.util.Scanner;

public class ExampleSwapping1 {

//	Swapping of two number using third variable

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("before swapping" +x+ "," +y );
		int a=x;
		x=y;
		y=a;
		System.out.println("after swapping" +x+"," +y);
		
	}
}
