package javaPrograms;

import java.util.Scanner;

public class ExampleTable {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=s.nextInt();
		System.out.println("Table for :" +a);
		for(int i=1; i<=10; i++)
		{
			
			System.out.println(a*i);
		}
	}
	
}
