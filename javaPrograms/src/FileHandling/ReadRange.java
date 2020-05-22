package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadRange {

	public void method(int x, int y) throws IOException
	{
		File f=new File("C:\\Users\\ansal verma\\Desktop\\Document.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		int a=0;
		while((s=b.readLine())!=null)
		{
			a=a+1;
			if((a==x)||(x<a)&&(a<=y))
			{
				System.out.println("value of string = " +s);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		ReadRange r=new ReadRange();
		Scanner s=new Scanner(System.in);
		System.out.println("intial number");
		int d=s.nextInt();
		System.out.println("last line number");
		int c=s.nextInt();
		r.method(d, c);
		
	}
}
