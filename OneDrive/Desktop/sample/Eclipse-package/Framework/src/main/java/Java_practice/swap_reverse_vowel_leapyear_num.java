package Java_practice;

public class swap_reverse_vowel_leapyear_num {
	public void reverse_a_number()
	{
		int original_number = 21061996;
		int reverse = 0;
		while(original_number>0)
		{
			int remainder = original_number%10;
			reverse = reverse*10+remainder;
			original_number=original_number/10;
		}
		System.out.println("reversed number is " +reverse);
	}
	//Revere string:
		String original ="maha";
		String reversed_name="";
		public void reverse_a_string()
		{
			for(int i=original.length()-1;i>=0;i--){
				reversed_name += original.charAt(i);
			}
			System.out.println(reversed_name);
		}
		
		// Reverse string using builder
		public void reverse_builder() {
			String original = "Mahalakshmi";
			StringBuilder sb = new StringBuilder(original);
			String reversed = sb.reverse().toString();
			System.out.println(original);
			System.out.println(reversed);
		}

	public void swapping_numbers()
	{
		int a = 10, b=20;
		System.out.println("Before swapping for a is "+a +"and b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping for a is "+a +"and b is "+b);
	}

	public void vowel_string(String str)
	{
		//String str= new String("This is Mahalakshmi");
		for(int i=0; i<str.length();i++)
		{
			if (str.charAt(i) =='a' || str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'||str.charAt(i) =='A'||str.charAt(i) =='E'||str.charAt(i) =='I'||str.charAt(i) =='O'||str.charAt(i) =='U') {;

			System.out.println("Given string " +str.charAt(i) +" is a vowel");	
			}
			else

				System.out.println("Given string " +str.charAt(i) +" is not a vowel");
		}

	}
	public void leap(int year)
	{
		boolean leap=false;
		if(year%4==0){
			System.out.println(+year+ " is a leap year");
		}
		if(year%100==0){
			System.out.println(+year+ " is not a leap year");
		}
		if(year%400==0){
			System.out.println(+year+ " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
	}
public void Missing_Number() {
	int[] arr = {1,2,3,5};
	int n = 5;
	int actual_sum = 0;
	int total = n*(n+1)/2;
	for(int num : arr) {
		
		actual_sum +=num;
	}
	System.out.println(total-actual_sum);
}

// summ of even digits in a number
public void even_sum() {
	int num = 12345;
	 int sum = 0;
	 
	 while (num>0){
	     int digit = num%10;
	     if(digit%2 ==0){
	         sum +=digit;
	     }
	     num = num/10;
	 }
	 System.out.println(sum);
}

// cehck rotation numbers
public void rotation() {
	 String str = "abcd";
	 String str1 = "dcba";
	 if(str.length() != str1.length()){
	     System.out.println("not a rotation");
	 }
	 else{
	     String combined = str + str;
	     if(combined.contains(str1)){
	         System.out.println(str1 + " is a rotation of " + str);
	     }
	     else{
	         System.out.println(str1 + " not a rotation of " +str);
	     }
	 }
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap_reverse_vowel_leapyear_num result = new swap_reverse_vowel_leapyear_num();
		//result.reverse_a_string("Gowtham maha");
		//result.reverse_a_number();
		//result.swapping_numbers();
		//result.vowel_string("This is Mahalakshmi");
		result.Missing_Number();

	}

}
