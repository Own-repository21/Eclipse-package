package Java.basics;

public class vowel {
	public void alphabet(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch =='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+ " is a vowel.");
	}
	else
	{
		System.out.println(ch+ " is not a vowel.");
	}
	}
	
	public void count() {
		String str = "cucumber21&21&06&1996";
		 int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
		for(int i = 0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(ch>='a' && ch<='z'){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		            vowels++;
		        }
		        else{
		            consonants++;
		        }
		    } else if (ch >= '0' && ch <= '9') { 
		            digits++;
		        }
		        else{
		            specialChars++;
		        }
		    }

		 System.out.println("Vowels: " + vowels);
		        System.out.println("Consonants: " + consonants);
		        System.out.println("Digits: " + digits);
		        System.out.println("Special Characters: " + specialChars);

	}
	
	public void replace_vowels() {
		String str = "programming";
		String result = "";	
			 for(int i =0;i<str.length();i++){
			     char ch = str.charAt(i);
			     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		                    result +=(char)(ch +1);
			 }else{
			     result +=ch;
			 }
			  
			 }
			 System.out.println("Original String: " + str);
		        System.out.println("Modified String: " + result);
		    }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowel sample =new vowel();
		sample.alphabet('7');

	}

}
