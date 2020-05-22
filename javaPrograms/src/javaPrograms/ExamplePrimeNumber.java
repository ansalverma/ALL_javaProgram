package javaPrograms;

import java.util.Scanner;

public class ExamplePrimeNumber {

//	A number is prime or not- number divisible by itself or 1
	
	public static void main(String[] args) {
		 System.out.println("enter a number");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=0;
        for(int i=1; i<=a;i++)
        {
        	if(a%i==0)
        	b++;
        }
        	if(b==2)       	
        	{
        		System.out.println("number is prime");
        	}
        	else
        	{
        		System.out.println("number is not prime");
        	}
        }
		
	}

