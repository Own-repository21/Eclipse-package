package Java_practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_Pattern {

	//String count of non-space chracter
	public void stringlength() {
		// TODO Auto-generated method stub
		String name = "Mahalakshmi Rajamohan"; // Your name
		String nameWithoutSpaces = name.replace(" ", ""); // Correctly remove spaces
		int str = nameWithoutSpaces.length(); // Count characters
		System.out.println("Number of letters in the name: " + str);
	}
	
	//Find duplicate char from string
	public void Duplicate_char() {
		String str= "Mahalakshmi";
		char[] character= str.toCharArray();
		int length= character.length;
		System.out.println("The length of string is : " +length);
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if (character[i] == character[j]) {
					System.out.print(character[i] + " ");
					break;
				}
			}
		}
	}
public void dulicate_Hashmap() {
	        String str = "Mahalakshmi";

	        // Convert to lowercase for case-insensitive check
	        str = str.toLowerCase();

	        // Create a HashMap to store character counts
	        HashMap<Character, Integer> map = new HashMap<>();

	        // Count each character
	        for (char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Print only duplicate characters (without counts)
	        System.out.println("Duplicate characters:");
	        for (char c : map.keySet()) {
	            if (map.get(c) > 1) {
	                System.out.print(c + " ");
	            }
	        }
}

//Print the occurrence of char
	public void count_occurence() {
		String str = "india country";
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) +1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		}
	
	//  Print only the Unique value
	public void unique() {
		String str = "india";
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char ch :str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(char ch : str.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.println(ch);
			}
		}
	}

public void anagram() {
	String str ="earth";
	String str1 = "heart";
	str = str.replaceAll("\\s", "").toLowerCase();
	str1=str1.replaceAll("\\s", "").toLowerCase();
	if(str.length()==str1.length()) {
		System.out.println("this is a anagram");
	}
	char[] arr1 = str1.toCharArray();
char[] arr2 =  str1.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
if(arr1==arr2) {
	System.out.println("This is anagram");
}
System.out.println(arr1);
System.out.println(arr2);
}
	
public void Non_Repeated_character(){
	String str = "Maha";
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		boolean repeated = false;
		for(int j=0;j<ch.length;j++ ) {
			if(i!=j && ch[i]==ch[j]) {
		 repeated = true;
			break;
		}
	}
		if(!repeated) {
			System.out.println(ch[i]);
			return;
		}
	}
}

// First Repeated character
public void First_Repeated_character(){
	String str = "programming";
	char[] ch = str.toCharArray();
	for(int i=0;i<ch.length;i++) {

		for(int j=1;j<ch.length;j++ ) {
			if(ch[i]==ch[j]) {
		System.out.println("First repeated character: " + ch[i]);
		return;
		}
	}
	
	}
}
	//	Swap two string using temp variable
	public void swapping(){
		String str1="maha";
		String str2="lakshmi";
		String Temp;

		Temp=str1;
		str1=str2;
		str2=Temp;

		System.out.println(str1);
		System.out.println(str2);
	}
	public void removing_Space()
	{
		String str="Good lunck";
		String result = str.replaceAll("\\s", "");
		System.out.println(result);
	}
	
	public void removing_Special_Charcters()   
	{
		String str="Good$ lunck&";
		String result = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
	}

	public void count() {
		String str = "Maha is preparing for technical questions";
        int count = 0;
        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
			// Check if character is a letter
            if (Character.isLetter(ch)) {
                count++;
            }
		}
		System.out.println(count);
	}
	

	//count the number of words in a string 
	public void count_word()
	{
		String str="Mahalakshmi is working in API Testing";
		int words=str.split("\\s").length;
		System.out.println(words);
	}
	//find whether a string or number is palindrome or not.
	public void Palindrome_string()
	{
		String str="Maha";
		String reversed="";
		for(int i=str.length()-1;i<0;i--){
			reversed +=str.charAt(i);

		}
		if(reversed==str){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
	
	//reverse a words without changing position
	public void words() {
        String str = "maha is a female";

        // Step 1: Split into words
        String[] words = str.split(" ");

        // Step 2: Reverse each word using StringBuilder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            builder.append(sb.reverse()); // reverse each word

            if (i != words.length - 1) {
                builder.append(" ");
            }
        }

        // Step 3: Print result
        System.out.println(builder.toString());
    }
	
	// Write Java code to reverse a string while preserving the whitespace.
	 public void reverse_withoutspace() {
		   String str = "maha r";
	        char[] arr = str.toCharArray();
	        char[] reverse = new char[arr.length];
	        
	        for(int i =0; i< arr.length;i++){
	            if(arr[i] == ' '){
	                reverse[i] = ' ';
	            }
	        }
	        int j = arr.length -1;
	        for(int i =0;i <arr.length; i++){
	            if(arr[i] !=' '){
	             while(reverse[j] == ' '){
	                j--;
	            } 
	        
	            reverse[j] = arr[i] ;
	            j--;
	            }
	            
	        }
	        System.out.println("Original: " + str);
	        System.out.println("Reversed: " + String.valueOf(reverse));
	        }
	   
	
	public static void main(String[] args) {
		String_Pattern s= new String_Pattern();
		//s.stringlength();
		s.Palindrome_string();
	}
}
