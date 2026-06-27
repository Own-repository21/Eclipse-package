package Utils_Framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileHnadling {
	
	String outputfilepathString ="C:\\Users\\Acer\\OneDrive\\Desktop\\sample\\Eclipse-package\\Framework\\Input";
	String outputfilenameString =" Writefile";
	
	String Outputfile = "Mahalakshmi R";
	public void writedata() throws IOException {
	File F = new File(outputfilepathString+outputfilenameString);
	FileOutputStream FO = new FileOutputStream(F);
	FO.write(Outputfile.getBytes());
	FO.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteFileHnadling text = new WriteFileHnadling();
		text.writedata();
	}

}
