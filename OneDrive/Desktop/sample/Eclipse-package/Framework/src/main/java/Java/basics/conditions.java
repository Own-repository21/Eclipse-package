package Java.basics;

public class conditions {
	public void ifconditions(int age)
	{
		if (age<20) {
			System.out.println("You are a Teenaged person");
		}
		
		else if (age>21&age<=35) {
			System.out.println("You are a women");
		}
		else if (age>35&age<=60) {
			System.out.println("You are about to become old");
		}
		else if (age>61) {
			System.out.println("you are senior citizen");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	public void switchconditions(String Gender)
	{
		switch(Gender)
		{
		case "M":
			System.out.println("You are a Male");
			break;
		case "F":
			System.out.println("You are a Female");
			break;
		default:
				System.out.println("You are a Transgenders");
				break;
		}
	}
	public void forloop()
	{
		for(int i=1;i<10;i++) {
		System.out.println(i);	
		}
	}
	public void whileloop(int i) {
		while (i<10) {
		System.out.println(i);
		i=i+1;
		}
	}
	public void dowhile(int i) {
		do {
			System.out.println(i);
			i=i+1;
		}while(i<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions a = new conditions(); //object implementation
		a.ifconditions(60); //method call
		a.switchconditions("F");
		a.forloop();
		a.whileloop(6);
		a.dowhile(6);
	}

}
