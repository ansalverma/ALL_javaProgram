package javaPrograms;

import java.util.Scanner;

public class ExmapleFactorial {
//         Factorial of number

	public static void main(String[] args) {
		int fact=1;
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is: " +fact);
	}
}
