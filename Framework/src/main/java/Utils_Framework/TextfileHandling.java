package Utils_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextfileHandling {
	String Filepath="C:\\Users\\Acer\\OneDrive\\Desktop\\sample\\Eclipse-package\\Framework\\Input";
	String Filename="Testdata.txt";
	public void readdata() throws IOException {
		File F = new File(Filepath+Filename);
		FileInputStream FI = new FileInputStream (F);
		System.out.println(FI.read());
		
	}
		public void readALLdata() throws IOException {
			File F = new File(Filepath+Filename);
			FileInputStream FI = new FileInputStream (F);
			int i=0;
			while((i=FI.read())!=-1);
			{
			System.out.print((char)i);
			}
		}
		public void readALLlines() throws IOException{
			File F = new File(Filepath+Filename);
			FileReader FI = new FileReader (F);
			int i=0;
			while((i=FI.read())!=-1);
			{
			System.out.print((char)i);
			}
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextfileHandling S = new TextfileHandling();
		S.readALLlines();
	}

}
