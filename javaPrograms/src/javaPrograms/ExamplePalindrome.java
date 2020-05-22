package javaPrograms;

import java.util.Scanner;

public class ExamplePalindrome {
//        A number is palindrome or not
	public static void main(String[] args) {
		int temp=0;
		int sum=0;
		int rem;
//		int a=12;
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		rem=a;
		if(a>10) {
			
		
		while(a>0)
		{
			temp=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		if(rem==sum)
		{
			System.out.println("it is palindrome number");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
		}
		else
		{
			System.out.println("enter the number");
		}
				
	}
}
