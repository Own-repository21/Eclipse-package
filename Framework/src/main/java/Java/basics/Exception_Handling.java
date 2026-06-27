package Java.basics;

import java.io.IOException;

public class Exception_Handling { 
	public void add(int a, int b) {
		try {
		int c= a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("This is Arithmetic exception");
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		finally{
			System.out.println("finally");
		}
	}
public void sub(int e,int f) throws ArithmeticException, IOException { 
	int g= e-f;
	System.out.println(g);
//	throw new ArithmeticException("This is an Exception"); 
}
	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		Exception_Handling d = new Exception_Handling();
		d.add(10, 0);
		d.sub(3, 2);
	}

}
