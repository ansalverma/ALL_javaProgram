package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public void readline(int k) throws IOException
	{
		File f=new File("C:\\Users\\ansal verma\\Desktop\\Document.txt");
		FileReader fr=new FileReader(f);
		BufferedReader fb=new BufferedReader(fr);
		String a;
		int b=0;
		while((a=fb.readLine())!=null)
		{
			b=b+1;
			if(b==k)
			{
				System.out.println(a);
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the line number");
		int n=s.nextInt();
		ReadTextFile r=new ReadTextFile();
		r.readline(n);
		s.close();
     }
	}
