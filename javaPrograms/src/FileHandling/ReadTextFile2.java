package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile2 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ansal verma\\Desktop\\Document.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
//			System.out.println(a);
			System.out.println((char)a);
		}
	}
}
